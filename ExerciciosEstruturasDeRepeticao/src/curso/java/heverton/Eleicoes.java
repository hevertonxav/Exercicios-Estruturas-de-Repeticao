
/*Numa eleição existem três candidatos. Faça um programa que peça o
número total de eleitores. Peça para cada eleitor votar e ao final
mostrar o número de votos de cada candidato.*/

package curso.java.heverton;

import java.util.Scanner;

public class Eleicoes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int i = 0;
		int numCandidato;
		boolean voto = false;

		// as variaveis declaradas abaixo são os numeros de votos de cada candidato
		int antonio = 0;
		int maria = 0;
		int luis = 0;

		System.out.println("Candidatos à eleição : ");
		System.out.println("Antonio Silva - 30 ");
		System.out.println("Maria de Oliveira - 40 ");
		System.out.println("Luís Pereira - 50 ");
		System.out.println("----------------------------------");
		System.out.println(" ");

		System.out.println("Digite a quantidade total de eleitores: ");
		n = scan.nextInt();

		do {

			i++;

			do {

				System.out.println("Eleitor " + i + ", por favor digite o número do seu candidato: ");
				numCandidato = scan.nextInt();

				if (numCandidato == 30 || numCandidato == 40 || numCandidato == 50) {

					voto = true;

				} else {
                    
					voto = false;
					System.out.println("Número inválido, digite novamente.");

				}

			} while (!voto);

			if (numCandidato == 30) {
				antonio++;
			}

			if (numCandidato == 40) {
				maria++;
			}

			if (numCandidato == 50) {
				luis++;
			}

		} while (i < n);

		System.out.println("Número total de votos do Antonio Silva: " + antonio);
		System.out.println("Número total de votos da Maria Oliveira: " + maria);
		System.out.println("Número total de votos do Luís Pereira: " + luis);

	}

}
