package ex6;

public class Sala {

	private int nFilas;			
	private int nColumnas;		//Max 25
	private Double precio;
	private Pelicula pelicula;
	
	
	public Sala(int nFilas, int nColumnas, Double precio, Pelicula pelicula) {
		this.nFilas = nFilas;
		this.nColumnas = nColumnas;
		this.precio = precio;
		this.pelicula = pelicula;
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
