package ex5;

/**
 * Clase ejecutable
 * @author Bárbara, Pau, Oriol
 */

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un array de profesor y  de Estudiante llamamos al metodo  rellenarArray para registrarlos
		Profesor profesor[] = new Profesor[3];
		Estudiante alumnos[] = new Estudiante[4];
		
		rellenarArray(profesor,alumnos);
		
		//Se crea una aula
		Aula aula = new Aula(1,3,"matemáticas",profesor[1],alumnos);		
		
		//Metodo de la clase aula para comprobar si se puede dar clase
		aula.darClase(aula);
	}
	
	public static void rellenarArray(Profesor[] profesor, Estudiante[] alumnos) {
		profesor[0] = new Profesor("Ferran",43,"Hombre","filosofía");
		profesor[1] = new Profesor("Andrea",35,"Mujer","matemáticas");
		profesor[2] = new Profesor("Patricia",61,"Mujer","física");
	
		alumnos[0] = new Estudiante("David",15,"Hombre",5.3);
		alumnos[1] = new Estudiante("Eiden",13,"Hombre",8.5);
		alumnos[2] = new Estudiante("Marta",17,"Mujer",3.7);
		alumnos[3] = new Estudiante("Elena",16,"Mujer",9.8);
	}
}