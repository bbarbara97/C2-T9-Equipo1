package ex3;

public class Libro {

	private int isbn;
	private String titulo;
	private String autor;
	private int nPaginas;
	
	//Constructor
	public Libro(int isbn, String titulo, String autor, int nPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}
	
	
	//Getters y Setters
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
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
		return "El libro con ISBN creado por el autor " + autor + " tiene" +  nPaginas + "páginas.";
	}
	
	
	
	
	
}
