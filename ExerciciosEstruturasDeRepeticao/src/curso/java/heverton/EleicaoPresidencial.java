
/*Em uma eleição presidencial existem quatro candidatos. Os votos são
informados por meio de código. Os códigos utilizados são:

 - 1, 2, 3, 4 - Votos para os respectivos candidatos
  (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
 - 5 - Voto Nulo
 - 6 - Voto em Branco

Faça um programa que calcule e mostre:

 - O total de votos para cada candidato;
 - O total de votos nulos;
 - O total de votos em branco;
 - A percentagem de votos nulos sobre o total de votos;
 - A percentagem de votos em branco sobre o total de votos. Para
finalizar o conjunto de votos tem-se o valor zero.*/

package curso.java.heverton;

import java.util.Scanner;

public class EleicaoPresidencial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int soma = 0;
		int opcaoVoto = 0;
		boolean voto = false;
		int totalVotos = 0;
		double percNulo = 0;
		double percBranco = 0;

		// as variaveis declaradas abaixo são os numeros de votos de cada candidato
		int antonio = 0;
		int maria = 0;
		int luis = 0;
		int rita = 0;
		int nulo = 0;
		int branco = 0;

		System.out.println("OPÇÕES DE VOTO : ");
		System.out.println("Antonio Silva - 1 ");
		System.out.println("Maria de Oliveira - 2 ");
		System.out.println("Luís Pereira - 3 ");
		System.out.println("Rita Sousa - 4 ");
		System.out.println("Voto nulo - 5 ");
		System.out.println("Voto em branco - 6 ");
		System.out.println("----------------------------------");
		System.out.println(" ");

		do {

			i++;

			do {

				System.out.println("Eleitor " + i + ", por favor digite o número do seu candidato: ");
				opcaoVoto = scan.nextInt();

				if (opcaoVoto >= 0 && opcaoVoto <= 6) {

					voto = true;

				} else {

					voto = false;
					System.out.println("Número inválido, digite novamente.");

				}

			} while (!voto);

			switch (opcaoVoto) {

			case 1:
				antonio++;
				break;
			case 2:
				maria++;
				 break;
			case 3:
				luis++;
				 break;
			case 4:
				rita++;
				 break;
			case 5:
				nulo++;
				 break;
			case 6:
				branco++;

			}

		} while (opcaoVoto != 0);

		totalVotos = antonio + maria + luis + rita + nulo + branco;
		percNulo = ((double) nulo / totalVotos) * 100;
		percBranco = ((double) branco / totalVotos) * 100;

		System.out.println("Número total de votos do Antonio Silva: " + antonio);
		System.out.println("Número total de votos da Maria Oliveira: " + maria);
		System.out.println("Número total de votos do Luís Pereira: " + luis);
		System.out.println("Número total de votos da Rita Sousa: " + rita);
		System.out.println("Número total de votos nulo: " + nulo);
		System.out.println("Número total em branco: " + branco);
		System.out.println("Total de votos: " + totalVotos);
		System.out.printf("%s%.2f%s\n", "Percentagem de votos nulos sobre o total de votos: " , percNulo ," %");
		System.out.printf("%s%.2f%s\n", "Percentagem de votos em branco sobre o total de votos: " , percBranco , " %");

	}

}
