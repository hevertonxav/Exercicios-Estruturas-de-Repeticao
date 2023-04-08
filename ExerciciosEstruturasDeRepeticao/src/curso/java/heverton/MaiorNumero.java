
//Faça um programa que leia 5 números e informe o maior número.

package curso.java.heverton;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cont = 0;
		int numero;
		int maior = Integer.MIN_VALUE;

		while (cont < 5) {
            
			cont++;
			
			System.out.println("Digite o " + cont + "° número:");
			numero = scan.nextInt();

			if (numero > maior) {

				maior = numero;

			}

		}
		
		System.out.println("Maior número: " + maior);


	}

}
