package ex6;

public class Sala {

	private int nFilas=0;			
	private int nColumnas=0;		//Max 25
	private Double precio;
	private Pelicula pelicula;
	private Asiento[][] asientos = new Asiento[nFilas][nColumnas];
	
	
	public Sala(int nFilas, int nColumnas, Double precio, Pelicula pelicula) {
		this.nFilas = nFilas;
		comprobarNColumnas(nColumnas);
		this.precio = precio;
		this.pelicula = pelicula;
	}

	private void comprobarNColumnas(int nColumnas) {
		if(nColumnas>25) {
			this.nColumnas = 25;
		}else {
			this.nColumnas = nColumnas;
		}
	}
	

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
