package ex1;

/**
 * Clase Television
 * Contiene informacion de television
 * @author Barbra, Pau, Oriol
 */
public class Television extends Electrodomestico{

	/*CONSTANTES*/
	private final double RESOLUCION_D = 20.0;
	private final boolean TDT_D = false;
	
	/*ATRIBUTOS*/
	private Double resolucion = RESOLUCION_D;
	private boolean tdt = TDT_D;
	
	
	/**CONSTRUCTORES**/
	
	//Constructor por defecto
	public Television() {
		this.resolucion = RESOLUCION_D;
		this.tdt = TDT_D;
	}
	
	/**
	 * Constructor con 2 parametros
	 * @param precioBase
	 * @param peso
	 */
	public Television(Double precioBase, Double peso) {
		super(precioBase,peso);
		this.resolucion = RESOLUCION_D;
		this.tdt = TDT_D;
	}
	
	/**
	 * Constructor con 6 parametros
	 * @param precioBase
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param resolucion
	 * @param tdt
	 */
	public Television(Double precioBase, Double peso, String color, char consumo, Double resolucion, boolean tdt) {
		super(precioBase, peso, color, consumo);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	/**	METODOS **/
	
	/**
	 * Calcula el precio final respecto a la resolucion
	 * si es superior a 40 le suma 30% respecto al precio base, 
	 * i si tiene tdt le suma 50 a precio final 
	 */
	public void precioFinal() {
		super.precioFinal();
		
		if(this.resolucion > 40) {
			precioFinal +=(precioBase * 0.3);
		}
		if(this.tdt) {
			precioFinal += precioFinal + 50;
		}
	}
	
	/**GETTERS**/

	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}
	
	
	
	
}
