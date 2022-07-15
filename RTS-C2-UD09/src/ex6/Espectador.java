package ex6;

public class Espectador {
	
	private String nombre;
	private int edad;
	private Double dinero;
	
	
	public Espectador(String nombre, int edad, Double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
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
