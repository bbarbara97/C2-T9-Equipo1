package ex5;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profesor = new Profesor("Ferran",43,"Hombre","filosof�a");
		Profesor profesor2 = new Profesor("Andrea",35,"Mujer","matem�ticas");
		Profesor profesor3 = new Profesor("Patricia",61,"Mujer","f�sica");

		Estudiante alumnos[] = {new Estudiante("David",15,"Hombre",5.3),
				new Estudiante("Eiden",13,"Hombre",8.5),
				new Estudiante("Marta",17,"Mujer",3.7),
				new Estudiante("Elena",16,"Mujer",9.8)};

		Aula aula = new Aula(1,3,"matem�ticas",profesor2,alumnos);
		
		aula.darClase(aula);
	}
}