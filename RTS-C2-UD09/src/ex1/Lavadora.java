package ex1;

public class Lavadora extends Electrodomestico{
	
	private double carga;
	
	private final double CARGA_D = 5.0;
	
	//Constructores
		public Lavadora() {
			this.carga = CARGA_D;
		}
		
		public Lavadora(Double precioBase, Double peso) {
			super(precioBase, peso);
			this.carga = CARGA_D;
		}
		
		public Lavadora(Double precioBase, Double peso, String color, char consumo) {
			super(precioBase, peso, color, consumo);
			this.carga = CARGA_D;
		}

		//Getters
		public double getCarga() {
			return carga;
		}
		
		//Metodos
		
}
