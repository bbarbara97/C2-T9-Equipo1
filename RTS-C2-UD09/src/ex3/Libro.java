package ex3;

/**
 * Clase Libro
 * Contiene informacion de un Libro
 * @author Bárbara, Pau, Oriol
 */

public class Libro {

	/**ATRIBUTOS**/
	private String isbn;
	private String titulo;
	private String autor;
	private int nPaginas;

	/**CONSTRUCTOR**/

	/**
	 *  Constructor con 4 parametros
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param nPaginas
	 */
	public Libro(String isbn, String titulo, String autor, int nPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}


	/**GETTERS & SETTERS**/

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	//Muestra la informacion del libro
	@Override
	public String toString() {
		return "El libro con ISBN " +isbn+ " creado por el autor " + autor + " tiene " +  nPaginas + " páginas.";
	}	
}
