package ex6;

import java.util.ArrayList;
import java.util.Hashtable;

public class Sala {

	private int nFilas;			
	private int nColumnas;		//Max 25
	private Double precio;
	private Pelicula pelicula;
	private Asiento[][] asientos; //= new Asiento[nFilas][nColumnas];
	
	private Hashtable<String, Asiento> asientosDisponibles = new Hashtable<String, Asiento>();
	private ArrayList<String> keysAsientosDisponibles = new ArrayList<String>();
	private Hashtable<String, Asiento> asientosOcupados = new Hashtable<String, Asiento>();
	private ArrayList<String> keysAsientosOcupados = new ArrayList<String>();

	//Constructor
	public Sala(int nFilas, int nColumnas, Double precio, Pelicula pelicula) {
		this.nFilas = nFilas;
		comprobarNColumnas(nColumnas);
		this.precio = precio;
		this.pelicula = pelicula;
		this.asientos = new Asiento[this.nFilas][this.nColumnas];
		crearSala(this.nFilas, this.nColumnas);
	}

	//Métodos
	public void crearSala(int nFilas, int nColumnas) {
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				asientos[i][j] = new Asiento(i+1, (char)(j+65));
				asientosDisponibles.put(Integer.toString(i+1) + (char)(j+65), asientos[i][j]);
				keysAsientosDisponibles.add(Integer.toString(i+1) + (char)(j+65));
			}
		}
	}

	public void comprobarNColumnas(int nColumnas) {
		if(nColumnas>25) {
			this.nColumnas = 25;
		}else {
			this.nColumnas = nColumnas;
		}
	}

	public int numAsientosOcupados(){
		return asientosOcupados.size();
	}
	
	public int numAsientosDisponibles(){
		return asientosDisponibles.size();
	}

	private void sentarEspectador(Espectador espectador) {
		int pos = (int) (keysAsientosDisponibles.size() * Math.random());
		String key = keysAsientosDisponibles.get(pos);
		
		int fil = asientosDisponibles.get(key).getFila()-1;
		int col = asientosDisponibles.get(key).getColumna()-65;
		
		asientos[fil][col].llenarAsiento(espectador);
		
		keysAsientosDisponibles.remove(pos);
		keysAsientosOcupados.add(key);
		asientosOcupados.put(key, asientos[fil][col]);
		asientosDisponibles.remove(key);
	}
	
	public void llenarSala(Espectador[] espectadores) {
		
		if(lleno() == false) {
			for(Espectador e:espectadores) {
				if(lleno() == false) {
					
					if(e.getDinero() >= this.precio && e.getEdad() >= pelicula.getEdadMinima())
						sentarEspectador(e);
					else
						System.out.println("Dinero o edad inválidos. - " + e.getEdad() + " años " + String.format("%.2f", e.getDinero())  + " €");
					
				}else {
					System.out.println("Sala llena");
				}
				
			}
		}
	}
	
	public boolean lleno() {
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				if(asientos[i][j].isDisponible()) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void MostrarAsientosTotal() {
		System.out.println("Hay en total: "+ (nColumnas * nFilas) + " asientos.");
		
		System.out.println("Hay en total: " + numAsientosOcupados() + " asientos ocupados.");
		System.out.println("Hay en total: " + numAsientosDisponibles() + " asientos disponibles.");
	}

	//Getters
	public int getnFilas() {
		return nFilas;
	}


	public int getnColumnas() {
		return nColumnas;
	}


	public Double getPrecio() {
		return precio;
	}


	public Pelicula getPelicula() {
		return pelicula;
	}
}