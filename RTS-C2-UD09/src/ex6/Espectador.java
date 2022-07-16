package ex6;

public class Espectador {
	
	private String nombre;
	private int edad;
	private Double dinero;
	
	//Constructor
	public Espectador(String nombre) {
		this.nombre = nombre;
		this.edad = (int) (Math.random()*25+4);		//edad min 4 max 28
		this.dinero = (Double) (Math.random()*20+4);//dinero min 3 max 23
	}

	//Getters
	public int getEdad() {
		return edad;
	}

	public Double getDinero() {
		return dinero;
	}
}
