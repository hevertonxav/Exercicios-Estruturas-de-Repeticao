
/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor .*/

package curso.java.heverton;

import java.util.Scanner;

public class ValorValido {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		while (!notaValida) {

			System.out.println("Digite uma nota: ");
			int nota = scan.nextInt();

			if (nota >= 0 && nota <= 10) {

				notaValida = true;
				System.out.println("Nota válida: " + nota);

			} else {

				System.out.println("Valor inválido, digite novamente");

			}
		}

	}

}
