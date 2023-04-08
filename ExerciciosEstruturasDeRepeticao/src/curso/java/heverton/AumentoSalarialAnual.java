/*
Um funcionário de uma empresa recebe aumento salarial anualmente,
sabe-se que:
  
  a. Esse funcionário foi contratado em 1995, com salário inicial de
  R$ 1.000,00;
  b. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
  c. A partir de 1997 (inclusive), os aumentos salariais sempre
  correspondem ao dobro do percentual do ano anterior. Faça um
  programa que determine o salário atual desse funcionário. Após
  concluir isto, altere o programa permitindo que o usuário digite o
  salário inicial do funcionário.
*/

package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoSalarialAnual {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int anoInicial = 1995;
		double salario = 1000;
		double percAumento = 1.5;
		int cont = 0;
		int anoAtual;

		System.out.println("Digite o ano atual: ");
		anoAtual = scan.nextInt();

		for (anoInicial = 1996; anoInicial <= anoAtual; anoInicial++) {

			salario *= (1 + (percAumento / 100));
			percAumento *= 2;

		}

		DecimalFormat df = new DecimalFormat("####0.00");

		System.out.println("Salário atual: R$" + df.format(salario));

	}

}
