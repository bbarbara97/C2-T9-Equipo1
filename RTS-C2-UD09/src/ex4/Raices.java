package ex4;

public class Raices {

	private int a;
	private int b;
	private int c;	

	//Constructor
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Métodos
	public double getDiscriminante(){

		return Math.pow(b, 2) - 4*a*c;
	}

	public boolean tieneRaices(){

		if(getDiscriminante()>0)
			return true;
		else
			return false;

	}

	public boolean tieneRaiz(){
		if(getDiscriminante()==0)
			return true;
		else
			return false;
	}

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

	public void obtenerRaices(){

		if(tieneRaices() == true) {
			double resultado= -Math.sqrt(getDiscriminante());
			double resultado1 = +Math.sqrt(getDiscriminante());

			System.out.println("Las reices són: " +resultado+ " o " +resultado1);
		}
	}

	public void obtenerRaiz(){
		if(tieneRaiz() == true) {

			double resultado1 = +Math.sqrt(getDiscriminante());
			System.out.println("La raiz es: " +resultado1);
		}

	}


}
