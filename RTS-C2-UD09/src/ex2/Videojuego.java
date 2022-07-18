package ex2;

/**
 * Clase Videojuego
 * Contiene informacion de un videojuego
 * @author B�rbara, Pau, Oriol
 *
 */

public class Videojuego implements Entregable {
	
	/**ATRIBUTOS**/
	protected String titulo;
	protected int nHoras;
	protected boolean entregado;
	protected String genero;
	protected String compa�ia;

	/**CONSTANTES**/
	protected final int N_HORAS = 10;
	protected final boolean ENTREGADO_D = false;

	/**CONSTRUCTORES**/
	
	//Constructor por defecto
	public Videojuego() {
		this.titulo = "";
		this.nHoras = N_HORAS;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.compa�ia = "";
	}
	
	/**
	 * Constructor con 2 parametros
	 * @param titulo
	 * @param nHoras
	 */
	public Videojuego(String titulo, int nHoras) {
		this.titulo = titulo;
		this.nHoras = nHoras;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.compa�ia = "";
	}
	
	/**
	 * Constructor con 4 parametros
	 * @param titulo
	 * @param nHoras
	 * @param genereo
	 * @param compa�ia
	 */
	public Videojuego(String titulo, int nHoras, String genereo, String compa�ia) {
		this.titulo = titulo;
		this.nHoras = nHoras;
		this.entregado = ENTREGADO_D;
		this.genero = genereo;
		this.compa�ia = compa�ia;
	}

	/**	METODOS **/
	
	//Cambia el estado de entregado a true
	public void entregar() {
		entregado = true;
	}

	//Cambia el estado de entregado a false
	public void devolver() {
		entregado = false;
	}
	
	//Indica el estado de entregado
	public boolean isEntregado() {
		return this.entregado;
	}
	
	//Compara dos videojuegos segun su numero de horas
	public int compareTo(Object a) {
		int estado =-1;

		if(this.nHoras==((Videojuego) a).getnHoras()) {
			//Las horas son iguales
			estado = 0;
		}else if (this.nHoras>((Videojuego) a).getnHoras()) {
			//El objeto 1 es mayor que la pasada por parametro
			estado = 1;
		}
		return estado;
	}

	/**GETTERS & SETTERS**/
	
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	//Muestra la informacion del videojuego
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", nHoras=" + nHoras + ", entregado=" + entregado + ", genero="
				+ genero + ", compa�ia=" + compa�ia + "]";
	}
}
