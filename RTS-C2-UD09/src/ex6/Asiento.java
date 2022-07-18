package ex6;

/**
 * Clase Asiento
 * Contiene toda la información del Asiento
 * @author Bárbara, Pau, Oriol
 */

public class Asiento {
	
	/**ATRIBUTOS**/
	
	private int fila;
	private char columna;
	private boolean disponible=true;
	private Espectador ocupante;
	private String id;
	
	/**CONSTRUCTOR**/
	
	/**
	 * Constructor con 2 parametros
	 * @param fila
	 * @param columna
	 */
	public Asiento(int fila, char columna) {
		
		this.fila = fila;
		this.columna = columna;
		this.id = Integer.toString(fila) + columna; 	
	}

	/**	METODOS **/
	
	//Comprueba que el asiento esta libre, si esta ocupado muestra por consola un mensaje
	public void llenarAsiento(Espectador ocupante) {
        if(isDisponible()) {
            this.ocupante = ocupante;
            this.disponible = false;
        }else {
        	System.out.println("Asiento " +fila+ "/" +columna+ " esta ocupado");
        }
    }
	
	//Devuelve el estado de disponible
	public boolean isDisponible() {
		return disponible;
	}
	
	/**GETTERS**/
	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}
}