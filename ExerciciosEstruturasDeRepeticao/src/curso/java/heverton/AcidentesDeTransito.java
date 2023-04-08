
/*Foi feita uma estatística em cinco cidades brasileiras para coletar
dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
 
 a. Código da cidade;
 b. Número de veículos de passeio (em 1999);
 c. Número de acidentes de trânsito com vítimas (em
 1999). Deseja-se saber:
 d. Qual o maior e menor índice de acidentes de transito e a que
 cidade pertence;
 e. Qual a média de veículos nas cinco cidades juntas;
 f. Qual a média de acidentes de trânsito nas cidades com menos
 de 2.000 veículos de passeio.*/

package curso.java.heverton;

import java.util.Scanner;

public class AcidentesDeTransito {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codCidade;
		int veiculosPasseio;
		int acidTransVit = 0;
		int maiorIndice = Integer.MIN_VALUE;
		int codMaiorInd = 0;
		int menorIndice = Integer.MAX_VALUE;
		int codMenorInd = 0;
		double mediaVeic = 0;
		int menos2000Veic = 0;
		double mediaMenos2000 = 0;
		int somaVeic = 0;
		int somaMenos2000Veic = 0;
		int cont = 0;
		

		for (int i = 1; i <= 5; i++) {

			System.out.println("SOBRE A " + i + "ª CIDADE");
			System.out.println(" ");

			System.out.println("Digite o código: ");
			codCidade = scan.nextInt();
			System.out.println("Digite o número de veículos de passeio: ");
			veiculosPasseio = scan.nextInt();
			System.out.println("Digite o número de acidentes de trânsito com vítimas  : ");
			acidTransVit = scan.nextInt();

			System.out.println("-------------------------------------------------------");

			if (acidTransVit > maiorIndice) {

				maiorIndice = acidTransVit;
				codMaiorInd = codCidade;

			}

			if (acidTransVit < menorIndice) {

			    menorIndice = acidTransVit;
				codMenorInd = codCidade;

			}
			
			if (veiculosPasseio < 2000) {
				
				cont++;
				menos2000Veic = acidTransVit;
				somaMenos2000Veic += menos2000Veic;

			}

			somaVeic += veiculosPasseio;
			mediaVeic = (double) somaVeic / i;
			mediaMenos2000 = (double)somaMenos2000Veic/cont;

		}
		
		System.out.println("A cidade " + codMaiorInd + " tem o maior índice com " + maiorIndice + " acidentes.");
		System.out.println("A cidade " + codMenorInd + " tem o menor índice com " + menorIndice + " acidentes.");
        System.out.println("Média de veículos nas cinco cidades juntas: " + mediaVeic);
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaMenos2000);
				

	}

}
