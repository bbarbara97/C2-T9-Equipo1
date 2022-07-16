package ex5;

public class Estudiante extends Persona{

	private Double calificacion; 	//0 - 10

	//Constructores
	public Estudiante(String nombre, int edad, String sexo, Double calificacion) {
		super(nombre,edad,sexo);
		comprobarCalificacion(calificacion);
	}

	//Metodos
	private void comprobarCalificacion(Double calificacion) {
		if(calificacion<0) {
			this.calificacion = 0.0;
		}else if(calificacion>10) {
			this.calificacion = 10.0;
		}else {
			this.calificacion = calificacion;
		}
	}

	@Override
	public boolean estaDisponible() {
		int num = (int) (2 * Math.random());

		if(num<1)		//50%
			return false;
		else
			return true;
	}

	public Double getCalificaion() {
		return calificacion;
	}
	
}
