
/*Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.*/

package curso.java.heverton;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int divisivel = 0;
		String output = " ";

		System.out.println("Digite um número: ");
		int n = scan.nextInt();

		do {

			i++;
			
			if (n % i == 0) {

				divisivel++;

			}

		} while (i <= n);

		if (divisivel == 2) {

			System.out.println("É número primo.");

		} else {

			System.out.println("Não é número primo.");

		}

	}

}
