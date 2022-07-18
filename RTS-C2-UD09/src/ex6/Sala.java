package ex6;

/**
 * Clase Sala
 * Contiene información de la Sala
 * @author Bárbara, Pau, Oriol
 */
import java.util.ArrayList;
import java.util.Hashtable;

public class Sala {

	/**ATRIBUTOS**/

	private int nFilas;			
	private int nColumnas;		//Max 25
	private Double precio;
	private Pelicula pelicula;
	private Asiento[][] asientos; //= new Asiento[nFilas][nColumnas];

	//Creamos dos hashtable para asientos ocupados y libres y dos arrayList para guardar la key de cada asiento
	private Hashtable<String, Asiento> asientosDisponibles = new Hashtable<String, Asiento>();
	private ArrayList<String> keysAsientosDisponibles = new ArrayList<String>();
	private Hashtable<String, Asiento> asientosOcupados = new Hashtable<String, Asiento>();
	private ArrayList<String> keysAsientosOcupados = new ArrayList<String>();

	/**CONSTRUCTOR**/

	/**
	 * Constructor con 4 parametros
	 * @param nFilas
	 * @param nColumnas
	 * @param precio
	 * @param pelicula
	 */
	public Sala(int nFilas, int nColumnas, Double precio, Pelicula pelicula) {
		this.nFilas = nFilas;
		comprobarNColumnas(nColumnas);
		this.precio = precio;
		this.pelicula = pelicula;
		this.asientos = new Asiento[this.nFilas][this.nColumnas];
		crearSala(this.nFilas, this.nColumnas);
	}

	/**	METODOS **/

	/**
	 *Se crea la sala, respecto al numero de filas y columnas
	 * y se añaden al Arraylits y al hashtable
	 */
	public void crearSala(int nFilas, int nColumnas) {
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				asientos[i][j] = new Asiento(i+1, (char)(j+65));
				asientosDisponibles.put(Integer.toString(i+1) + (char)(j+65), asientos[i][j]);
				keysAsientosDisponibles.add(Integer.toString(i+1) + (char)(j+65));
			}
		}
	}
	
	//Comprueba el numero de columnas que no sea superior a 25
	//si es superior cambia el numero de columnas a 25
	public void comprobarNColumnas(int nColumnas) {
		if(nColumnas>25) {
			this.nColumnas = 25;
		}else {
			this.nColumnas = nColumnas;
		}
	}
	
	//Devuelve los asientos ocupados
	public int numAsientosOcupados(){
		return asientosOcupados.size();
	}
	
	//Devuelve los asientos libres
	public int numAsientosDisponibles(){
		return asientosDisponibles.size();
	}
	
	//Asignamos un asiento al espectador
	private void sentarEspectador(Espectador espectador) {
		int pos = (int) (keysAsientosDisponibles.size() * Math.random());
		String key = keysAsientosDisponibles.get(pos);

		int fil = asientosDisponibles.get(key).getFila()-1;
		int col = asientosDisponibles.get(key).getColumna()-65;
		
		asientos[fil][col].llenarAsiento(espectador);
		
		//Elimina el asiento del hashtable disponible y lo añade al de ocupados 
		keysAsientosDisponibles.remove(pos);
		keysAsientosOcupados.add(key);
		asientosOcupados.put(key, asientos[fil][col]);
		asientosDisponibles.remove(key);
	}

	
	
	public void llenarSala(Espectador[] espectadores) {
		//llena la sala, comprueba si esta llena, si no va añadiendo espectadores hasta llenar la sala
		if(lleno() == false) {
			for(Espectador e:espectadores) {
				if(lleno() == false) {
					//el espectador tiene que tener el dinero suficiente y la edad suficiente, sino muestra un mensaje
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
	
	//Comprueba que la sala no este llena
	//si esta llena devuelve true, sino false
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

	//Imprime la información de los asientos (totales/ocupados/libres)
	public void MostrarAsientosTotal() {
		System.out.println("Hay en total: "+ (nColumnas * nFilas) + " asientos.");
		System.out.println("Hay en total: " + numAsientosOcupados() + " asientos ocupados.");
		System.out.println("Hay en total: " + numAsientosDisponibles() + " asientos disponibles.");
	}

	/**GETTERS**/
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