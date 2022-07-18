package ex1;

/**
 * Clase Lavadora
 * Contiene informacion de lavadora
 * @author Bárbara, Pau, Oriol
 */
public class Lavadora extends Electrodomestico{
	
	/**CONSTANTE**/
	private final double CARGA_D = 5.0;
	
	/**ATRIBUTO**/
	private Double carga = CARGA_D;
	
	/**CONSTRUCTORES**/
	
	//Constructor por defecto
	public Lavadora() {
		this.carga = CARGA_D;
	}
	/**
	 * Constructor con 2 parametros
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(Double precioBase, Double peso) {
		super(precioBase, peso);
		this.carga = CARGA_D;
	}
	
	/**
	 * Constructor con 5 parametros
	 * @param precioBase
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param carga
	 */
	public Lavadora(Double precioBase, Double peso, String color, char consumo, Double carga) {
		super(precioBase, peso, color, consumo);
		this.carga = carga;
	}
	
	/**	METODOS **/
	
	/**
	 * Calcula el precio final respecto a la carga
	 * si es superior a 30 le suma 50 a precio final 
	 */
	public void precioFinal() {
		super.precioFinal();
		
		if(this.carga > 30) {
			precioFinal += 50;
		}
	}

	/**GETTERS**/
	
	public double getCarga() {
		return carga;
	}
}
