package ex3;

public class mainApp {

	public static void main(String[] args) {

		Libro[] Libros = new Libro[2];
		rellenarArray(Libros);
		masPaginas(Libros);
	}
	
	public static void rellenarArray(Libro[] Libros) {
		Libros[0] = new Libro("1234567891012", "Fundaci�n Esplai", "B�rbara", 200);
		Libros[1] = new Libro("9876543210123", "T-Systems", "Pau", 100);
		
		System.out.println(Libros[0].toString());
		System.out.println(Libros[1].toString());
	}
	
	public static void masPaginas(Libro[] Libros) {
		if(Libros[0].getnPaginas()>Libros[1].getnPaginas()) {
			System.out.println("El libro con m�s paginas es: " + Libros[0].toString());
		} else if(Libros[0].getnPaginas()<Libros[1].getnPaginas()){
			System.out.println("El libro con m�s paginas es: " + Libros[1].toString());
		}else {
			System.out.println("Los dos libros tienen el mismo n�mero de p�ginas.\n\t" + Libros[0].toString() + "\n\t" + Libros[1].toString());
		}
	}

}
