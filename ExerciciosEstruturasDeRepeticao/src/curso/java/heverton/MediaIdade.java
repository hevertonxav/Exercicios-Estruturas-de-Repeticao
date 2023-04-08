
/*Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.*/

package curso.java.heverton;

import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n;
		int i = 0;
		int idade;
		int soma = 0;
		double media;

		System.out.println("Digite a quantidade de pessoas entrevistadas: ");
		n = scan.nextInt();

		do {

			i++;

			System.out.println("Digite a idade da " + i + "ª pessoa: ");
			idade = scan.nextInt();

			soma += idade;
			media = (double) soma / i;

		} while (i < n);

		System.out.println("Média de idade da turma: " + media);

		if (media > 0 && idade <= 25) {

			System.out.println("Turma jovem");

		} else if (media > 25 && idade <= 60) {

			System.out.println("Turma adulta");

		} else {

			System.out.println("Turma idosa");

		}

	}

}
