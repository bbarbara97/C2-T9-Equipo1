package ex1;

public class Television extends Electrodomestico{

	private Double resolucion;
	private boolean tdt;
	
	//Constantes
	private final double RESOLUCION_D = 20.0;
	private final boolean TDT_D = false;
	
	
	//Constructores
	public Television() {
		this.resolucion = RESOLUCION_D;
		this.tdt = TDT_D;
	}
	
	
	public Television(Double precioBase, Double peso, Double resolucion, boolean tdt) {
		super(precioBase,peso);
		this.resolucion = RESOLUCION_D;
		this.tdt = TDT_D;
	}
	
	public Television(Double precioBase, Double peso, String color, char consumo, Double resolucion, boolean tdt) {
		super(precioBase, peso, color, consumo);
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
