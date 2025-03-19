package br.com.engsenai.model;

public class Retangulo {
	private double base;
	private double altura;

	public void setBase(double base) {
		if (base<0) {
			this.base = 1;
		}else {
		this.base = base;
		}
	}
	
	public void setAltura(double altura) {
		if (altura<0) {
			this.altura = 1;
		}else {
		this.altura = altura;
		}
	}
	
	private double calcularArea() {
		double area = base * altura;
		return area;
		
	}
	
	private double calcularPerimetro() {
		double perimetro = 2 * base + 2 * altura;
		return perimetro;
		
	}
		
	public void mostrarDados() {
		
		System.out.println("------------------------------");
		System.out.println("RETANGULO");
		System.out.println("------------------------------");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("PERIMETRO:" + calcularPerimetro());
		System.out.println("------------------------------");
		
		
	}
	
}
