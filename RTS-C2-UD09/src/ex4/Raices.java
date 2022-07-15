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
		
		return Math.pow(b, 2) - 4*a - c;
	}

	public boolean tieneRaices(){

		if(getDiscriminante()>=0)
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

	}

	public void obtenerRaices(){

	}

	public void obtenerRaiz(){

	}


}
