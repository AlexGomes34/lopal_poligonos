package br.com.engsenai.ui;

import java.util.Scanner;

public class Menu {

	public void criarMenu() {
		
		System.out.println("---------------------------");
		System.out.println("Calculadora De Polígonos");
		System.out.println("---------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Triangulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Retângulo");
		System.out.println("5 - Circunfêrencia");
		System.out.println("6 - Sair");
		System.out.println("---------------------------");
		System.out.print("Escolha uma das opções (1 - 6): ");
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		System.out.println("A opção " + opcao + " foi escolhida");
		
	}
	
}
