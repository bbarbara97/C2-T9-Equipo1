package ex2;

public class Videojuego implements Entregable {

	protected String titulo;
	protected int nHoras;
	protected boolean entregado;
	protected String genero;
	protected String compañia;

	//Constantes
	protected final int N_HORAS = 10;
	protected final boolean ENTREGADO_D = false;

	//Constructores
	public Videojuego() {
		this.titulo = "";
		this.nHoras = N_HORAS;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int nHoras) {
		this.titulo = titulo;
		this.nHoras = nHoras;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int nHoras, String genereo, String compañia) {
		this.titulo = "";
		this.nHoras = nHoras;
		this.entregado = ENTREGADO_D;
		this.genero = genereo;
		this.compañia = compañia;
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

	public int compareTo(Object a) {

		int estado =-1;

		if(this.nHoras==((Videojuego) a).getnHoras()) {
			//Las horas son iguales
			estado =0;
		}else if (this.nHoras>((Videojuego) a).getnHoras()) {
			//El objeto 1 es mayor que la pasada por parametro
			estado=1;
		}
		return estado;
	}

	//Getters y Setters	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnHoras() {
		return nHoras;
	}

	public void setnHoras(int nHoras) {
		this.nHoras = nHoras;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", nHoras=" + nHoras + ", entregado=" + entregado + ", genero="
				+ genero + ", compañia=" + compañia + "]";
	}
}
