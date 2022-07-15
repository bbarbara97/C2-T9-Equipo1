package ex6;

public class mainApp {

	public static void main(String[] args) {
		
		Pelicula pelicula = new Pelicula("El rey León","Roger Allers",7,92);
		
		Sala sala = new Sala(8,10,7.50,pelicula);
		Espectador espectadores[] = new Espectador[5];
		
		for(int i = 0; i < espectadores.length; i++) {
			espectadores[i] = new Espectador("Espectador "+i);
		}
		
		sala.llenarSala(espectadores);
		//for(int i = 0; i < espectadores.length; i++) {
		//	System.out.println(espectadores[i].toString());
		//}
	}

}