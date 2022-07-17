package ex4;

/**
 * Clase Raices
 * Calcula una ecuacion de 2º grado
 * @author Bárbara, Pau, Oriol
 */
public class Raices {

	/**ATRIBUTOS**/
	private int a;
	private int b;
	private int c;	

	//**CONSTRUCTORES**/

	/**
	 * Valores de la ecuacion
	 * @param a
	 * @param b
	 * @param c
	 */
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**	METODOS **/

	//Nos devuelve el valor del discriminante
	public double getDiscriminante(){
		return Math.pow(b, 2) - 4*a*c;
	}

	//Si el discriminante es mayor a 0 nos devuelve true, sino false
	public boolean tieneRaices(){
		if(getDiscriminante()>0)
			return true;
		else
			return false;
	}

	//Si el discriminante es igual a 0 nos devuelve true, sino false
	public boolean tieneRaiz(){
		if(getDiscriminante()==0)
			return true;
		else
			return false;
	}

	//Calcula la ecuacion de 2º grado
	public void calcular(){
		if(tieneRaices() == true) {
			double resultado =	(-b-Math.sqrt(getDiscriminante()))/(2*a);
			double resultado1 = (-b+Math.sqrt(getDiscriminante()))/(2*a);

			System.out.println("Las soluciones posibles són: " +resultado+ " o " +resultado1);

		} else if(tieneRaiz() ==  true) {
			double resultado2 =	(-b/(2*a));
			System.out.println("La solución es: " +resultado2);
		}
	}

	//Obtiene las raices cuando hay dos soluciones
	public void obtenerRaices(){
		if(tieneRaices() == true) {
			double resultado= -Math.sqrt(getDiscriminante());
			double resultado1 = +Math.sqrt(getDiscriminante());

			System.out.println("Las raices són: " +resultado+ " o " +resultado1);
		}
	}

	//Obtiene la raiz cuando hay 1 solucion
	public void obtenerRaiz(){
		if(tieneRaiz() == true) {

			double resultado1 = +Math.sqrt(getDiscriminante());
			System.out.println("La raiz es: " +resultado1);
		}
	}
}
