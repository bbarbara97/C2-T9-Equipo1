package ex5;

/**
 * Clase Alua
 * Contiene informacion de una aula
 * @author Bárbara, Pau, Oriol
 *
 */

public class Aula {
	
	/**ATRIBUTOS**/
	private int id;
	private int maxEstudiantes;
	private String materia;
	Profesor profesor;
	Estudiante estudiantes[];

	/**CONSTRUCTOR**/
	
	/**
	 * Constructor con 5 parametros
	 * @param id
	 * @param maxEstudiantes
	 * @param materia
	 * @param profesor
	 * @param estudiantes
	 */
	public Aula(int id, int maxEstudiantes, String materia, Profesor profesor, Estudiante[] estudiantes) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}

	/**	METODOS **/
	
	//Metodo que crea la clase y comprueba si se puede dar clase o no
	public void darClase(Aula aula) {
		int nAlumnos = 0;
		int alumnosAsistentes = 0;
		int contadorH = 0;
		int contadorM = 0;
		
		//Comprueba la cantidad de estudiantes que pueden assistir
		for(Estudiante a:aula.getEstudiantes()) {
			if(a.estaDisponible()) {
				alumnosAsistentes ++;
			}
			//Comprobamos el sexo del estudiante
			nAlumnos++;
			if(a.getSexo().equals("Hombre") && a.getCalificaion() >= 5) {
				contadorH++;
			} else if(a.getCalificaion() >= 5) {
				contadorM++;
			}
		}
		//Si las condiciones puestas por dar clase son correctas imprime por consola el resultado
		if(aula.getProfesor().estaDisponible() == true && aula.getMaterias().equals(aula.getProfesor().getMateria()) 
				&& aula.getEstudiantes().length >= (aula.getMaxEstudiantes() / 2) && alumnosAsistentes > nAlumnos/2){
			
			System.out.println("Si se puede dar la clase.");
			System.out.println("Alumnos aprobados: " + contadorH);
			System.out.println("Alumnas aprobadas: "+ contadorM);
				
		} else {
			System.out.println("No se puede dar la clase.");
		}
	}
	
	/**GETTERS & SETTERS**/
	
	public int getId() {
		return id;
	}
	
	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public String getMaterias() {
		return materia;
	}
}