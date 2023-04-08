
/*Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/


package curso.java.heverton;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int resultado = 1;

		System.out.println("Digite a base da potência:");
		int base = scan.nextInt();
		
		System.out.println("Digite o expoente:");
		int exp = scan.nextInt();
		
		while(exp != 0) {
			
			resultado = resultado * base;
			exp --;
		
		}
		
		System.out.println("Resultado: " + resultado);

		


	}

}
