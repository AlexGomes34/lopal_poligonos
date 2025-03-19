package br.com.engsenai.model;

public class Quadrado {

	private double lado;

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	private double calcularArea() {
		double area = lado * lado;
		return area;
		
	}
	
	private double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
		
	}
		
	public void mostrarDados() {
		
		System.out.println("------------------------------");
		System.out.println("QUADRADO");
		System.out.println("------------------------------");
		System.out.println("Lado: " + lado);
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("PERIMETRO:" + calcularPerimetro());
		System.out.println("------------------------------");
		
		
	}

}
