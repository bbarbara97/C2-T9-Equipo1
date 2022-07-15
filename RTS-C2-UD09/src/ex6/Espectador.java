package ex6;

public class Espectador {
	
	private String nombre;
	private int edad;
	private Double dinero;
	
	
	public Espectador(String nombre, int edad, Double dinero) {
		this.nombre = nombre;
		this.edad = (int) (Math.random()*25+1);
		this.dinero = (Double) (Math.random()*20+1);
	}


	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public Double getDinero() {
		return dinero;
	}
	
	

}
