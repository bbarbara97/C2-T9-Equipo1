package ex5;

public abstract class Persona {
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	public abstract boolean estaDisponible();

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
}
