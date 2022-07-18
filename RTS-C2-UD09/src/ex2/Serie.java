package ex2;

/**
 * Clase Serie
 * Contiene informacion de una serie
 * @author Bárbara, Pau, Oriol
 *
 */

public class Serie implements Entregable{

	/**ATRIBUTOS**/
	protected String titulo;
	protected int nTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	/**CONSTANTES**/
	protected final int N_TEMPORADAS = 3;
	protected final boolean ENTREGADO_D = false;


	/**CONSTRUCTORES**/
	
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.nTemporadas = N_TEMPORADAS;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.creador = "";
	}

	/**
	 * Constructor con 2 parametros
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.nTemporadas = N_TEMPORADAS;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.creador = creador;
	}
	
	/**
	 * Constructor con 4 parametros
	 * @param titulo
	 * @param nTemporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int nTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.entregado = ENTREGADO_D;
		this.genero = genero;
		this.creador = creador;
	}

	/**	METODOS **/
	
	//Cambia el estado de entregado a true
	public void entregar() {
		this.entregado = true;
	}
	
	//Cambia el estado de entregado a false
	public void devolver() {
		this.entregado = false;
	}
	
	//Indica el estado de entregado
	public boolean isEntregado() {
		return this.entregado;
	}
	
	//Compara dos series segun su numero de temporadas
	public int compareTo(Object a) {
		int estado =-1;

		if(this.nTemporadas ==((Serie) a).getnTemporadas()) {
			//Las horas son iguales
			estado = 0;
		}else if (this.nTemporadas>((Serie) a).getnTemporadas()) {
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

	//Muestra la informacion de la Serie
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
}
