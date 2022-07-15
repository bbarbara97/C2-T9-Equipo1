package ex5;

public class Estudiante extends Persona{

	private Double calificaion; 	//0 - 10

	//Constructores
	public Estudiante(Double calificaion) {
		super();
		this.calificaion = calificaion;
	}

	//Metodos
	private void comprobarCalificacion(Double calificacion) {
		if(calificacion<0) {
			this.calificaion = 0.0;
		}else if(calificacion>10) {
			this.calificaion = 10.0;
		}else {
			this.calificaion = calificacion;
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
		return calificaion;
	}
	
}
