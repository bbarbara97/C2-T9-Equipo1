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
	
	//Metodos
	public void precioFinal() {
		switch (this.consumo) {
		case 'A':
			this.precioFinal += 100;
			break;
		case 'B':
			this.precioFinal += 80;
			break;
		case 'C':
			this.precioFinal += 60;
			break;
		case 'D':
			this.precioFinal += 50;
			break;
		case 'E':
			this.precioFinal += 30;
			break;
		case 'F':
			this.precioFinal += 10;
			break;
		default:
			break;
		}
		if(this.peso <=19) {
			this.precioFinal += 10;
		} else if(this.peso <=49) {
			this.precioFinal += 50;
		}else if(this.peso <=79) {
			this.precioFinal += 80;
		} else {
			this.precioFinal += 100;
		}
		
		if(this.resolucion > 40) {
			precioFinal +=(precioFinal * 0.3);
		}
		if(this.tdt) {
			precioFinal += precioFinal + 50;
		}
	}
	
	//Getters
	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}
	
	
	
	
}
