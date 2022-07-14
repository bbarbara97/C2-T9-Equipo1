package ex1;

public class Lavadora {
	
	private double carga;
	
	private final double CARGA_D = 5.0;
	
	//Constructores
		public Lavadora() {
			this.carga = CARGA_D;
		}
		
		public Lavadora(double precioBase, double peso) {
			super(precioBase, peso);
			this.carga = CARGA_D;
		}
		
		public Lavadora(double precioBase, double peso, String color, char consumo) {
			super(precioBase, peso, color, consumo);
			this.carga = CARGA_D;
		}

		//Getters
		public double getCarga() {
			return carga;
		}
		
		//Metodos
		
}
