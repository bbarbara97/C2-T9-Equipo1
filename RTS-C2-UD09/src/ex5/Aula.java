package ex5;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula {
	
	private int id;
	private int maxEstudiantes;
	private String[] arrayMaterias = {"matemáticas", "filosofía", "física"};
	private final ArrayList<String> MATERIAS = new ArrayList<>(Arrays.asList(arrayMaterias));
	Profesor profesor;
	Estudiante estudiantes[];

	//Constructores
	
	public Aula(int id, int maxEstudiantes, String[] arrayMaterias, Profesor profesor, Estudiante[] estudiantes) {
		super();
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.arrayMaterias = arrayMaterias;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}

	//Métodos
	public void darClase(Aula aula) {
		if(aula.getProfesor().estaDisponible() == true && aula.getMATERIAS().equals(aula.getProfesor().MATERIAS) && aula.getEstudiantes().length >= (aula.getMaxEstudiantes() / 2)){
			System.out.println("Si se puede dar la clase.");
			
		} else {
			System.out.println("No se puede dar la clase.");
		}
	}
	
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public ArrayList<String> getMATERIAS() {
		return MATERIAS;
	}
	
	

}
