package ex5;

/**
 * Clase Estudiante
 * Clase Estudiante hereda de la clase Persona
 * @author Bárbara, Pau, Oriol
 */
public class Estudiante extends Persona{
	
	/*ATRIBUTO*/
	private Double calificacion; 	//0 - 10

	/*CONSTRUCTOR*/

	/**
	 * Constructor con 4 parametros
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param calificacion
	 */
	public Estudiante(String nombre, int edad, String sexo, Double calificacion) {
		super(nombre,edad,sexo);
		comprobarCalificacion(calificacion);
	}

	/*METODOS*/

	//Comprueba que la calificacion sea correcta, no puede ser inferior a 0 o superior a 10
	private void comprobarCalificacion(Double calificacion) {
		if(calificacion<0) {
			this.calificacion = 0.0;
		}else if(calificacion>10) {
			this.calificacion = 10.0;
		}else {
			this.calificacion = calificacion;
		}
	}	
	
	//Devuelve la calificacion del estudiante
	public Double getCalificaion() {
		return calificacion;
	}
	
	//Comprueba si el alumno esta disponible
	@Override
	public boolean estaDisponible() {
		int num = (int) (2 * Math.random());

		if(num<1)		//50%
			return false;
		else
			return true;
	}
}
