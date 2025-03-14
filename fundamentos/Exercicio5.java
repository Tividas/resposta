package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	/** 5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área. 
	 * 1 - ler os valores
	 * 2 - calcular area
	 * 3 - mostrar valor
	 * 
	*/
	
	public static void main(String[] args) {
	   
		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite a Base:");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a Altura:");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A Área do Triângulo é: " + area);
		
		scanner.close();
	}

}