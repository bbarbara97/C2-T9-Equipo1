package ex3;

public class mainApp {

	public static void main(String[] args) {

		Libro[] Libros = new Libro[2];
		rellenarArray(Libros);
		masPaginas(Libros);
	}
	
	public static void rellenarArray(Libro[] Libros) {
		Libros[0] = new Libro("1234567891012", "Fundación Esplai", "Bárbara", 200);
		Libros[1] = new Libro("9876543210123", "T-Systems", "Pau", 100);
		
		System.out.println(Libros[0].toString());
		System.out.println(Libros[1].toString());
	}
	
	public static void masPaginas(Libro[] Libros) {
		if(Libros[0].getnPaginas()>Libros[1].getnPaginas()) {
			System.out.println("El libro con más paginas es: " + Libros[0].toString());
		} else if(Libros[0].getnPaginas()<Libros[1].getnPaginas()){
			System.out.println("El libro con más paginas es: " + Libros[1].toString());
		}else {
			System.out.println("Los dos libros tienen el mismo número de páginas.\n\t" + Libros[0].toString() + "\n\t" + Libros[1].toString());
		}
	}

}
