package br.com.engsenai.model;

public class Trapezio {

	public double baseMaior;
	public double baseMenor;
	public double altura;
	public double area;
	public double perimetro;
	
	public void calcularArea() {
		area = (baseMaior + baseMenor) * altura /2;
		
	}
	
}
