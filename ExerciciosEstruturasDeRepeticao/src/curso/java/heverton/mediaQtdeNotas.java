
/*Faça um programa que calcule o mostre a média aritmética de N
notas.*/

package curso.java.heverton;

import java.util.Scanner;

public class mediaQtdeNotas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int i = 0;
		double nota;
		double soma = 0;
		double media;

		System.out.println("Quantas notas você deseja calcular a média? ");
		n = scan.nextInt();

		do {
			i++;

			System.out.println("Digite a " + i + "ª nota:");
			nota = scan.nextDouble();

			soma += nota;

			media = (double) soma / i;

		} while (i < n);

		System.out.println("Média total: " + media);

	}

}
