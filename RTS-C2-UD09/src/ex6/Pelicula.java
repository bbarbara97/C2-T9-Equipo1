package ex6;

/**
 * Clase Pelicula
 * Contiene información de la Pelicula
 * @author Bárbara, Pau, Oriol
 */
public class Pelicula {
	
	private String titulo;
	private String director;
	private int edadMinima;
	private int duracion; 	//minutos
	
	/**CONSTRUCTOR**/
	
	/**
	 * Constructor con 4 parametros
	 * @param titulo
	 * @param director
	 * @param edadMinima
	 * @param duracion
	 */
	public Pelicula(String titulo, String director, int edadMinima, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.edadMinima = edadMinima;
		this.duracion = duracion;
	}

	/**GETTERS**/
	public int getEdadMinima() {
		return edadMinima;
	}
}
