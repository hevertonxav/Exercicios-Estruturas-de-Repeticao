
/*Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.*/

package curso.java.heverton;

public class CrescimentoPopulacao {

	public static void main(String[] args) {

		int popA = 80000;
		int popB = 200000;
		int anos = 0;

		while (popA < popB) {

			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			anos++;

		}

		System.out.println("População país A: " + popA);
		System.out.println("População país B: " + popB);
		System.out.println("População do país A demorou " + anos + " anos pra ser maior ou igual do país B.");

	}

}
