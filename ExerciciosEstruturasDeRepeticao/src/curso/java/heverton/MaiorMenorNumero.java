
/*Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.*/

package curso.java.heverton;

import java.util.Scanner;

public class MaiorMenorNumero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite a quantidade de valores que deseja inserir: ");
		int n = scan.nextInt();

		do {

			i++;

			System.out.println("Digite o " + i + "° valor: ");
			int valor = scan.nextInt();

			soma += valor;

			if (valor > maior) {

				maior = valor;

			}

			if (valor < menor) {

				menor = valor;

			}

		} while (i < n);

		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Soma de todos os valores: " + soma);

	}

}
