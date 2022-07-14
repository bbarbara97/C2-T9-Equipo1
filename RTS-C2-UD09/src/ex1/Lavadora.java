package ex1;

public class Lavadora extends Electrodomestico{

	private Double carga;

	private final double CARGA_D = 5.0;

	//Constructores
	public Lavadora() {
		this.carga = CARGA_D;
	}

	public Lavadora(Double precioBase, Double peso) {
		super(precioBase, peso);
		this.carga = CARGA_D;
	}

	public Lavadora(Double precioBase, Double peso, String color, char consumo, Double carga) {
		super(precioBase, peso, color, consumo);
		this.carga = carga;
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
		
		if(this.carga > 30) {
			precioFinal += 50;
		}
	}


	//Getters
	public double getCarga() {
		return carga;
	}
}
