package br.com.engsenai.model;

public class Retangulo {
	public double base;
	public double altura;

	public double calcularArea() {
		double area = base * altura;
		return area;
		
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * base + 2 * altura;
		return perimetro;
		
	}
		
	
}
