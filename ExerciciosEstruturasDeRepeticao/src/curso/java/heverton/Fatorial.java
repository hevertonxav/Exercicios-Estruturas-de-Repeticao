
/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120*/

package curso.java.heverton;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número que deseja obter o fatorial: ");
		int n = scan.nextInt();

		int fatorial = 1;

		System.out.print(n + "! = ");

		while (n > 0) {

			fatorial *= n;
			n--;

		}

		System.out.print(fatorial);

	}

}
