package ex5;

import java.util.ArrayList;
import java.util.Arrays;

public class Profesor extends Persona{

	private String materia;
	private final String MATERIA_D = "matemáticas";
	protected String[] arrayMaterias = {"matemáticas", "filosofía", "física"};
	protected final ArrayList<String> MATERIAS = new ArrayList<>(Arrays.asList(arrayMaterias));

	//Constructores
	public Profesor(String materia, String[] arrayMaterias) {
		super();
		this.materia = materia;
		this.arrayMaterias = arrayMaterias;
	}

	//Metodos
	private void comprobarMateria(String materia){
		if(MATERIAS.contains(materia.toLowerCase()))
			this.materia = materia;
		else
			this.materia = MATERIA_D;
	}

	@Override
	public boolean estaDisponible() {
		int num = (int) (5 * Math.random());

		if(num<1)		//20%
			return false;
		else
			return true;
	}

	public String getMateria() {
		return materia;
	}

	public String[] getArrayMaterias() {
		return arrayMaterias;
	}
	
}
