package ex2;

/**
 * Clase ejecutable
 * @author Bárbara, Pau, Oriol
 */
public class mainApp {

	public static void main(String[] args) {

		//Creamos dos arrays de cada tipo de objeto
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		//Llamamos a los metodos
		rellenarArray(series,videojuegos);
		entrega(series,videojuegos);
		masHoras(series,videojuegos);
	}

	public static void rellenarArray(Serie[] series, Videojuego[] videojuegos) {

		//Creamos un objeto de cada posicion del array
		series[0] = new Serie("Stranger Things", "Pepe");
		series[1] = new Serie("Breaking Bad", "Pepe");
		series[2] = new Serie("Suits", "Mike");
		series[3] = new Serie("Game of Thrones", 8, "Tronos", "Pepe");
		series[4] = new Serie("The Walking Dead", 11, "Gore", "Pepe");

		videojuegos[0] = new Videojuego("Elden Ring", 40);
		videojuegos[1] = new Videojuego("The Last of Us", 18);
		videojuegos[2] = new Videojuego("Cyberpunk 2077", 30);
		videojuegos[3] = new Videojuego("RDR 2", 50, "Open World", "Rockstar");
		videojuegos[4] = new Videojuego("Assassins Creed", 15, "Aventura", "Ubisoft");
	}

	public static void entrega(Serie[] series, Videojuego[] videojuegos) {

		//Entregamos dos series y 3 videojuegos
		series[0].entregar();
		series[3].entregar();
		videojuegos[1].entregar();
		videojuegos[2].entregar();
		videojuegos[3].entregar();

		//Recoremos el array y comprobamos si esta entregado
		int numVideojuegos=0, numSeries=0;
		for(int i=0; i<5; i++) {
			if(videojuegos[i].entregado) {
				System.out.println(videojuegos[i].toString());
				videojuegos[i].devolver();
				numVideojuegos++;
			}
			if(series[i].entregado) {
				System.out.println(series[i].toString());
				series[i].devolver();
				numSeries++;
			}
		}
		System.out.println("Hay " + numVideojuegos + " videojuegos entregados.");
		System.out.println("Hay " + numSeries + " series entregadas.\n");
	}

	public static void masHoras(Serie[] series, Videojuego[] videojuegos) {
		int horasMax=0, tempMax=0, seriePos=0, videojuegoPos=0;

		//Recoremos el array y comprobamos el videojuego que tiene mas horas
		// y la serie que tiene mas temporadas
		for(int i=0; i<5; i++) {
			if(horasMax <= videojuegos[i].getnHoras()) {
				videojuegoPos = i;
				horasMax = videojuegos[i].getnHoras();
			}
			if(tempMax <= series[i].getnTemporadas()) {
				seriePos = i;
				tempMax = series[i].getnTemporadas();
			}
		}
		System.out.println("Más horas: " + videojuegos[videojuegoPos].toString());
		System.out.println("Más temporadas: " + series[seriePos].toString());
	}
}
