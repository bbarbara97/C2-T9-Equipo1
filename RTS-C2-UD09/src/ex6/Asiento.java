package ex6;

public class Asiento {
	
	private int fila;
	private char columna;
	private boolean disponible=true;
	private Espectador ocupante;
	private String id;
	

	public Asiento(int fila, char columna) {
		
		this.fila = fila;
		this.columna = columna;
		this.id = Integer.toString(fila) + columna;
	}

	public void llenarAsiento(Espectador ocupante) {
        if(isDisponible()) {
            this.ocupante = ocupante;
            this.disponible = false;
        }else {
        	System.out.println("Asiento " +fila+ "/" +columna+ " esta ocupado");
        }
    }

	public int getFila() {
		return fila;
	}


	public char getColumna() {
		return columna;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public Espectador getOcupante() {
		return ocupante;
	}


	public String getId() {
		return id;
	}

	public void setOcupante(Espectador ocupante) {
		this.ocupante = ocupante;
	}
	
	
	
	
}