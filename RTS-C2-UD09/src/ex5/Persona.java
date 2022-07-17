package ex5;

/**
 * Clase Persona
 * Contiene informacion de persona
 * @author Bárbara, Pau, Oriol
 *
 */
public abstract class Persona {
	
	/**ATRIBUTOS**/
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	/**CONSTRUCTOR**/
	
	/**
	 * Constructor con 3 parametros
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	//Metodo abstracto, las clases hijas deben implementarlo
	public abstract boolean estaDisponible();
	
	/**GETTERS**/
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}
}
