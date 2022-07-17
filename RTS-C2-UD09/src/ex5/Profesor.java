package ex5;

/**
 * Clase Profesor
 * Clase Profesor hereda de la clase Persona
 * @author Bárbara, Pau, Oriol
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Profesor extends Persona{
	
	/*ATRIBUTO*/
	
	private String materia;
	
	//ArrayList con asignaturas disponibles
	private final String MATERIA_D = "matemáticas";
	protected String[] arrayMaterias = {"matemáticas", "filosofía", "física"};
	protected final ArrayList<String> MATERIAS = new ArrayList<>(Arrays.asList(arrayMaterias));

	/*CONSTRUCTOR*/
	
	/**
	 * Constructor con 4 parametros
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param materia
	 */
	public Profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre,edad,sexo);
		comprobarMateria(materia);
	}

	/*METODOS*/
	
	//Comprueba las nateria, no importa si la entrada es en mayuscula o minuscula
	//devuelve la materia passada por parametro, sino queda por defecto
	private void comprobarMateria(String materia){
		if(MATERIAS.contains(materia.toLowerCase()))
			this.materia = materia;
		else
			this.materia = MATERIA_D;
	}

	//Comprueba si el profesor esta disponible
	@Override
	public boolean estaDisponible() {
		int num = (int) (5 * Math.random());

		if(num<1)		//20%
			return false;
		else
			return true;
	}
	
	//Devuelve la materia del profesor
	public String getMateria() {
		return materia;
	}
}
