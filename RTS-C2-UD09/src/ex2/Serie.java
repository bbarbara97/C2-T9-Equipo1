package ex2;

public class Serie implements Entregable{

	protected String titulo;
	protected int nTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	//Constantes
	protected final int N_TEMPORADAS = 3;
	protected final boolean ENTREGADO_D = false;


	//Constructores
	public Serie() {
		this.titulo = "";
		this.nTemporadas = N_TEMPORADAS;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.nTemporadas = N_TEMPORADAS;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int nTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.entregado = ENTREGADO_D;
		this.genero = genero;
		this.creador = creador;
	}
	
	//Métodos
	public void entregar() {
		entregado = true;
	}
	
	public void devolver() {
		entregado = false;
	}
	
	public boolean isEntregado() {
		
		return true;
	}
	
	public void compareTo(Object a) {
		
	}
	
	//Getters y Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	

}
