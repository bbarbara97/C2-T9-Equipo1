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
	
	protected Double precioFinal = 0.0;
	protected Double precioBase = PRECIO_D;
	protected Double peso = PESO_D;
	protected String color = COLOR_D;
	protected char consumo = CONSUMO_D;


	public Electrodomestico() {
	}


	public Electrodomestico(Double precioBase, Double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}


	public Electrodomestico(Double precioBase, Double peso, String color, char consumo) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumo = consumo;
	}

	protected void comprobarConsumoEnergetico(char consumo) {
		if(consumo>64 && consumo<91) 
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
			precioFinal = this.precioBase + 100;
			break;
		case 'B':
			precioFinal = this.precioBase + 80;
			break;
		case 'C':
			precioFinal = this.precioBase + 60;
			break;
		case 'D':
			precioFinal = this.precioBase + 50;
			break;
		case 'E':
			precioFinal = this.precioBase + 30;
			break;
		case 'F':
			precioFinal = this.precioBase + 10;
			break;

		default:
			break;
		}
		if(this.peso <=19) {
			precioFinal = this.precioBase +  10;
		} else if(this.peso <=49) {
			precioFinal = this.precioBase + 50;
		}else if(this.peso <=79) {
			precioFinal = this.precioBase + 80;
		} else {
			precioFinal = this.precioBase + 100;
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
