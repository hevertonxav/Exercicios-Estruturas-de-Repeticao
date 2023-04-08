
/*Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.*/

package curso.java.heverton;

import java.util.Scanner;

public class MediaAlunosPorTurma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int qtdeTurmas;
		int qtdeAlunos;
		boolean valido = false;
		int soma = 0;
		double media;

		System.out.println("Entre com a quantidade de turmas:");
		qtdeTurmas = scan.nextInt();

		do {

			i++;

			do {

				System.out.println("Quantos alunos tem a turma " + i + " ? ");
				qtdeAlunos = scan.nextInt();

				if (qtdeAlunos <= 40) {

					valido = true;

				} else {

					System.out.println("Quantidade inválida, a turma tem  mais de 40 alunos.");
					System.out.println("Digite a quantidade válida");
					System.out.println(" ");


					valido = false;

				}

			} while (!valido);
			
			soma += qtdeAlunos;
			media = (double) soma/qtdeTurmas;

		} while (i < qtdeTurmas);
		
		System.out.println("Média de alunos por turma: " + media);


	}

}
