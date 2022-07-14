package ex2;

public class mainApp {

	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

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
		
		series[0].entregar();
		series[3].entregar();
		videojuegos[1].entregar();
		videojuegos[2].entregar();
		videojuegos[3].entregar();
		
		int numVideojuegos=0, numSeries=0;
		for(int i=0; i<5; i++) {
			if(videojuegos[i].entregado) {
				System.out.println(videojuegos[i].toString());
				numVideojuegos++;
			}
			if(series[i].entregado) {
				System.out.println(series[i].toString());
				numSeries++;
			}
		}
		System.out.println("Hay " + numVideojuegos + " videojuegos entregados.");
		System.out.println("Hay " + numSeries + " series entregadas.\n");
		
		int horasMax=0, tempMax=0, seriePos=0, videojuegoPos=0;
		
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
