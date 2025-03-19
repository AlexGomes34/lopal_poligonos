package br.com.engsenai.model;

public class Triangulo {

	public double base;
	public double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea(){
		double area = base * altura /2;
		return area;
		
	}
		
	public void mostrarDados() {
		
		System.out.println("------------------------------");
		System.out.println("TRIANGULO");
		System.out.println("------------------------------");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("------------------------------");
		
		
	}
	
}
