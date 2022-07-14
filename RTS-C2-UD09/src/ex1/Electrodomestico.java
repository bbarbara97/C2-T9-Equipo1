package ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Electrodomestico {

	protected String[] arrayColores = {"blanco", "negro", "rojo", "azul", "gris"};
	protected final ArrayList<String> COLORES = new ArrayList<>(Arrays.asList(arrayColores));

	protected final Double PRECIO_D = 100.0;
	protected final Double PESO_D = 5.0;
	protected final String COLOR_D = "blanco";
	protected final char CONSUMO_D = 'F';
	
	
	protected Double precioBase = PRECIO_D;
	protected Double precioFinal = precioBase;
	protected Double peso = PESO_D;
	protected String color = COLOR_D;
	protected char consumo = CONSUMO_D;


	public Electrodomestico() {
	}


	public Electrodomestico(Double precioBase, Double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.precioFinal = precioBase;
	}


	public Electrodomestico(Double precioBase, Double peso, String color, char consumo) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		comprobarConsumoEnergetico(consumo);
		this.precioFinal = precioBase;
	}

	protected void comprobarConsumoEnergetico(char consumo) {
		if(consumo>64 && consumo<71) 
			this.consumo = consumo;
		else
			this.consumo = 'F';
	}

	protected void comprobarColor(String color) {
		if(COLORES.contains(color.toLowerCase()))
			this.color = color;
		else
			this.color = "blanco";
	}

	protected void precioFinal() {
		switch (this.consumo) {
		case 'A':
			this.precioFinal += 100;
			break;
		case 'B':
			this.precioFinal += 80;
			break;
		case 'C':
			this.precioFinal += 60;
			break;
		case 'D':
			this.precioFinal += 50;
			break;
		case 'E':
			this.precioFinal += 30;
			break;
		case 'F':
			this.precioFinal += 10;
			break;
		default:
			break;
		}
		if(this.peso <=19) {
			this.precioFinal += 10;
		} else if(this.peso <=49) {
			this.precioFinal += 50;
		}else if(this.peso <=79) {
			this.precioFinal += 80;
		} else {
			this.precioFinal += 100;
		}

	}

	/////				GETTERS				//////

	public Double getPrecioBase() {
		return precioBase;
	}


	public Double getPeso() {
		return peso;
	}


	public String getColor() {
		return color;
	}


	public char getConsumo() {
		return consumo;
	}
	
	public Double getPrecioFinal() {
		return precioFinal;
	}

}
