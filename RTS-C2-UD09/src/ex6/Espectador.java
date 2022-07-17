package ex6;

/**
 * Clase Espectador
 * Contiene información del Espectador
 * @author Bárbara, Pau, Oriol
 */

public class Espectador {
	
	/**ATRIBUTOS**/
	
	private String nombre;
	private int edad;
	private Double dinero;
	
	/**CONSTRUCTOR**/
	
	/**
	 *  Constructor con 1 parametros
	 *  La edad y el dinero se crean aleatorios
	 * @param nombre
	 */
	public Espectador(String nombre) {
		this.nombre = nombre;
		this.edad = (int) (Math.random()*25+4);		//edad min 4 max 28
		this.dinero = (Double) (Math.random()*20+4);//dinero min 3 max 23
	}

	/**GETTERS**/
	
	public int getEdad() {
		return edad;
	}

	public Double getDinero() {
		return dinero;
	}
}
