package br.com.engsenai;

import br.com.engsenai.model.Quadrado;
import br.com.engsenai.model.Circunferencia;
import br.com.engsenai.model.Retangulo;
import br.com.engsenai.model.Trapezio;
import br.com.engsenai.model.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado();
		q1.setLado(2);
		q1.mostrarDados();
		
		Retangulo r1 = new Retangulo();
		r1.setBase(23);
		r1.setAltura(12);
		r1.mostrarDados();
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(5);
		t1.setBase(9);
		t1.mostrarDados();
		
		Trapezio tr1 = new Trapezio();
		tr1.getAltura();
		tr1.getBaseMaior();
		tr1.getBaseMenor();
		tr1.mostrarDados();
		
		
		Circunferencia c1 = new Circunferencia();
		c1.setRaio(4);
		c1.calcularArea();
		c1.calcularCircunferencia();
		c1.mostrarDados();
	}
	
}