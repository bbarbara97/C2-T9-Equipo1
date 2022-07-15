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
	
	
	
}
