
/*Faça um programa que leia dez conjuntos de dois valores, o primeiro
representando o número do aluno e o segundo representando a sua
altura em centímetros. Encontre o aluno mais alto e o mais baixo.
Mostre o número do aluno mais alto e o número do aluno mais baixo,
junto com suas alturas.*/

package curso.java.heverton;

import java.util.Scanner;

public class AlturaAlunos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numAluno;
		double alturaAluno;
		int numMaiorAlt = Integer.MIN_VALUE;
		int numMenorAlt = Integer.MAX_VALUE;
		double maiorAlt = Integer.MIN_VALUE;
		double menorAlt = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Digite o número do " + i + "º aluno: ");
			numAluno = scan.nextInt();

			System.out.println("Digite a altura do " + i + "º aluno (em m): ");
			alturaAluno = scan.nextDouble();

			if (alturaAluno > maiorAlt) {

				maiorAlt = alturaAluno;
				numMaiorAlt = numAluno;

			}

			if (alturaAluno < menorAlt) {

				menorAlt = alturaAluno;
				numMenorAlt = numAluno;

			}

		}

		System.out.println("ALUNO MAIS ALTO");
		System.out.println("Número: " + numMaiorAlt);
		System.out.println("Altura: " + maiorAlt + " m");
		System.out.println(" ");
		System.out.println("ALUNO MAIS BAIXO");
		System.out.println("Número: " + numMenorAlt);
		System.out.println("Altura: " + menorAlt + " m");

	}

}
