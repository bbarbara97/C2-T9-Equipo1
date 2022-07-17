package ex6;

/**
 * Clase ejecutable
 * @author Bárbara, Pau, Oriol
 */

public class mainApp {

	public static void main(String[] args) {
		
		//Creamos un objeto de Pelicula
		Pelicula pelicula = new Pelicula("El rey León","Roger Allers",7,92);
		
		//Creamos un objeto de Sala
		Sala sala = new Sala(8,10,7.50,pelicula);
		
		//Creamos un array de espectadores MAX.100
		Espectador espectadores[] = new Espectador[100];
		
		//Llamamos a los metodos para crear los espectadores, y llenar la sala
		//Se termina cuando la sala esta llena o no hay mas espectadores
		rellenarArray(espectadores);
		sala.llenarSala(espectadores);
		sala.MostrarAsientosTotal();
	}
	
	//Crea espectadores recorriendo el array de espactadores MAX 100
	public static void rellenarArray(Espectador[] espectadores) {
		for(int i = 0; i < espectadores.length; i++) {
			espectadores[i] = new Espectador("Espectador "+i);
		}
	}
}