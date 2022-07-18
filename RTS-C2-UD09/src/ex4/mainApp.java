package ex4;

/**
 * Clase ejecutable
 * @author Bárbara, Pau, Oriol
 */
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos el objeto de Raices
		Raices raices = new Raices(-1, 7, -10);
		
		// Con los metodos de la calse Raices calculamos
		raices.calcular();
		raices.obtenerRaices();
		raices.obtenerRaiz();
	}
}
