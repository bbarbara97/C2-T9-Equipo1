package ex1;

public class Television extends Electrodomestico{

	private double resolucion;
	private boolean tdt;
	
	//Constantes
	private final double RESOLUCION_D = 20.0;
	private final boolean TDT_D = false;
	
	
	//Constructores
	public Television() {
		this.resolucion = RESOLUCION_D;
		this.tdt = TDT_D;
	}
	
	
	public Television(double resolucion, boolean tdt) {
		super(precioBase,peso);
		this.resolucion = RESOLUCION_D;
		this.tdt = TDT_D;
	}
	
	public Television(double precioBase, String color, char consumo, double peso, double resolucion, boolean tdt) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	//Getters
	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}
	
	
	//Metodos
	
}
