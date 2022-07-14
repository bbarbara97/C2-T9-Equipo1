package ex3;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int nPaginas;
	
	//Constructor
	public Libro(String isbn, String titulo, String autor, int nPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}
	
	
	//Getters y Setters
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
	
	@Override
	public String toString() {
		return "El libro con " +isbn+ " creado por el autor " + autor + " tiene " +  nPaginas + " páginas.";
	}
	
	
	
	
	
}
