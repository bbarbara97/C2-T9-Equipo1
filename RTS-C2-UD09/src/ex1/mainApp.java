package ex1;

/**
 * Clase ejecutable
 * @author Bárbara, Pau, Oriol
 */
public class mainApp {

	public static void main(String[] args) {
		/**
		 *Creamos un array de electrodomestcos y llamamos a los metodos
		 *para registrarlos y separarlos por utilidades
		 */
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		registrarElectrodomestico(electrodomesticos);
		utilidades(electrodomesticos);
	}

	public static void registrarElectrodomestico(Electrodomestico[] electrodomesticos) {
		//Asignamos las posiciones del array
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
	}

	public static void utilidades(Electrodomestico[] electrodomesticos) {
		
		double precioTvs=0, precioLavadoras = 0;
		/**
		*Recorremos el array de electrodomesticos, si encuentra una tv o una lavadora
		*pasara por su clase y por la de electrodomesticos, y se ejecutara en cada uno 
		*sus propios metodos para el calculo de precio final
		*/
		for(int i = 0; i < electrodomesticos.length; i++) {

			electrodomesticos[i].precioFinal();

			if(electrodomesticos[i] instanceof Television) {
				precioTvs += electrodomesticos[i].getPrecioFinal();
			}
			if(electrodomesticos[i] instanceof Lavadora) {
				precioLavadoras += electrodomesticos[i].getPrecioFinal();
			}
		}

		System.out.println("El precio total de las lavadoras es: " + precioLavadoras + " €");
		System.out.println("El precio total de las televisiones es: " + precioTvs + " €");

		double precioSuma =0;
		
		//Recorre el array electrodomesticos y suma todos los precios de todas las posiciones
		for(int i=0; i < electrodomesticos.length; i++) {
			precioSuma += electrodomesticos[i].getPrecioFinal();
		}
		System.out.print("El precio total de los electrodomesticos es: " + precioSuma + " €");

	}


}
