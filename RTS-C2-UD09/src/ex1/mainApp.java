package ex1;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		electrodomesticos[0] = new Lavadora(150.0, 200.0, "blanco", 'C',40.0);
		electrodomesticos[1] = new Lavadora(150.0, 10.0, "rojo", 'B',60.0);
		electrodomesticos[2] = new Lavadora(150.0, 25.0, "azul", 'F',30.0);
		electrodomesticos[3] = new Lavadora(150.0, 45.0, "negro", 'E',60.0);
		electrodomesticos[4] = new Electrodomestico(150.0, 150.0, "gris", 'A');

		electrodomesticos[5] = new Television(150.0, 200.0, "rojo", 'C',12.0, true);
		electrodomesticos[6] = new Electrodomestico(150.0, 100.0, "rosa", 'B');
		electrodomesticos[7] = new Television(150.0, 25.0, "gris", 'A',50.0, true);
		electrodomesticos[8] = new Television(150.0, 45.0, "blanco", 'J',20.0, false);
		electrodomesticos[9] = new Television(150.0, 150.0, "negro", 'E',40.0, true);

		for(int i = 0; i < 10; i++) {

			electrodomesticos[i].precioFinal();
			System.out.println(electrodomesticos[i].getConsumo() + " Precio: " + electrodomesticos[i].getPrecioFinal() + " €.");
		}

		for(int i =0; i<10; i++) {

			if(electrodomesticos[i] instanceof Lavadora) {
				System.out.println("El precio de las Lavadoras es " +electrodomesticos[i].getPrecioFinal());
			}
			if(electrodomesticos[i] instanceof Television) {
				System.out.println("El precio de las Televisiones es " +electrodomesticos[i].getPrecioFinal());
			}
		}
		
		double precioSuma =0;
		
		for(int i=0; i<10; i++) {
			precioSuma += electrodomesticos[i].getPrecioFinal();
		}
			System.out.print("El precio total de los electrodomesticos es:" +precioSuma);


	}



}
