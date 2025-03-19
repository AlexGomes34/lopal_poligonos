package br.com.engsenai.model;

public class Circunferencia {

	public double raio;
	
	public void setRaio(double raio) {
		if (raio<0) {
			this.raio = 1;
		}else {
		this.raio = raio; 
		}
	}
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public double calcularCircunferencia() {
		double circunferencia = 2 * Math.PI * raio;
		return circunferencia;
	}
	
	public void mostrarDados() {
		
		System.out.println("------------------------------");
		System.out.println("CIRCUNFÊRENCIA");
		System.out.println("------------------------------");
		System.out.println("BaseMaior: " + raio);
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("CIRCUNFÊRENCIA: " + calcularCircunferencia());
		System.out.println("------------------------------");
		
		
	}
	
}
