package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	/** 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC. 
	 * 1 - ler peso e altura
	 * 2 - calcular o imc
	 * 3 - mostrar o resultado
	*/
	
	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso:");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura:");
		double altura = scanner.nextDouble();
		
		double imc = peso / ( altura * altura );
		
		System.out.print("IMC: " + imc);
		
		scanner.close();
	}

}
