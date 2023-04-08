
/*Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/

package curso.java.heverton;

import java.util.Scanner;

public class QuantidadeParesImpares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int par = 0;
		int impar = 0;

		while (i < 10) {

			i++;

			System.out.println("Digite o " + i + "° número: ");
			int num = scan.nextInt();

			if (num % 2 == 0) {

				par++;

			} else {

				impar++;

			}

		}
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);


		

	}

}
