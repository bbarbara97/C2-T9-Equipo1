package ex5;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula {
	
	private int id;
	private int maxEstudiantes;
	private String materia;
	Profesor profesor;
	Estudiante estudiantes[];

	//Constructores
	
	public Aula(int id, int maxEstudiantes, String materia, Profesor profesor, Estudiante[] estudiantes) {
		super();
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}

	//Métodos
	public void darClase(Aula aula) {
		int nAlumnos = 0;
		int alumnosAsistentes = 0;
		int contadorH = 0;
		int contadorM = 0;
		
		for(Estudiante a:aula.getEstudiantes()) {
			if(a.estaDisponible()) {
				alumnosAsistentes ++;
				
			}
			nAlumnos++;
			if(a.getSexo().equals("Hombre") && a.getCalificaion() >= 5) {
				contadorH++;
			} else if(a.getCalificaion() >= 5) {
				contadorM++;
			}
		}
		
		
		if(aula.getProfesor().estaDisponible() == true && aula.getMaterias().equals(aula.getProfesor().getMateria()) 
				&& aula.getEstudiantes().length >= (aula.getMaxEstudiantes() / 2) && alumnosAsistentes > nAlumnos/2){
			
			System.out.println("Si se puede dar la clase.");
			
			System.out.println("Alumnos aprobados: " + contadorH);
			System.out.println("Alumnas aprobadas: "+ contadorM);
			
			
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

	public String getMaterias() {
		return materia;
	}
	
	

}