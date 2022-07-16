package ex6;

public class Pelicula {
	
	private String titulo;
	private String director;
	private int edadMinima;
	private int duracion; 	//minutos
	
	//Constructor
	public Pelicula(String titulo, String director, int edadMinima, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.edadMinima = edadMinima;
		this.duracion = duracion;
	}

	//Getters
	public int getEdadMinima() {
		return edadMinima;
	}
}
