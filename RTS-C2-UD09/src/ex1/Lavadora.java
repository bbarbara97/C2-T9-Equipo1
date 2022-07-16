package ex1;

public class Lavadora extends Electrodomestico{

	private final double CARGA_D = 5.0;
	
	private Double carga = CARGA_D;

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
		
		super.precioFinal();
		
		if(this.carga > 30) {
			precioFinal += 50;
		}
	}


	//Getters
	public double getCarga() {
		return carga;
	}
}
