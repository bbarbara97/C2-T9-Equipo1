package ex6;

public class Sala {

	private int nFilas;			
	private int nColumnas;		//Max 25
	private Double precio;
	private Pelicula pelicula;
	private Asiento[][] asientos = new Asiento[nFilas][nColumnas];
	
	public Sala(int nFilas, int nColumnas, Double precio, Pelicula pelicula) {
		this.nFilas = nFilas;
		comprobarNColumnas(nColumnas);
		this.precio = precio;
		this.pelicula = pelicula;
		crearSala(nFilas, nColumnas);
	}
	
	private void crearSala(int nFilas, int nColumnas) {
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				asientos[i][j] = new Asiento((i+1), (char)(j+65));
			}
		}
	}
	
	private void comprobarNColumnas(int nColumnas) {
        if(nColumnas>25) {
            this.nColumnas = 25;
        }else {
            this.nColumnas = nColumnas;
        }
    }


	public int getnFilas() {
		return nFilas;
	}


	public int getnColumnas() {
		return nColumnas;
	}


	public Double getPrecio() {
		return precio;
	}


	public Pelicula getPelicula() {
		return pelicula;
	}
	
	
	
}