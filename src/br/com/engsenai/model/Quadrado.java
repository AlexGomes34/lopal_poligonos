package br.com.engsenai.model;

public class Quadrado {

	private double lado;
	
	public void setLado(double lado) {
		if (lado<0) {
			this.lado = 1;
		}else {
		this.lado = lado;
		}
	}
	
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
		
	}
	
	private double calcularPerimetro() {
		double perimetro = 4 * lado;
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
