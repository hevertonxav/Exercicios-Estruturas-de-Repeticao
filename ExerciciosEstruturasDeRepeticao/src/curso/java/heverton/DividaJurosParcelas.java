
/*Faça um programa que receba o valor de uma dívida e mostre uma
tabela com os seguintes dados: valor da dívida, valor dos juros,
quantidade de parcelas e valor da parcela.

- Os juros e a quantidade de parcelas seguem a tabela abaixo:
   
   Quantidade de Parcelas      % de Juros sobre o valor inicial da dívida
          
          1                            0
          3                           10
          6                           15
          9                           20
         12                           25
- Exemplo de saída do programa:

Valor da Dívida    Valor dos Juros    Quantidade de Parcelas    Valor da Parcela
R$ 1.000,00             0                      1                  R$ 1.000,00
R$ 1.100,00            100                     3                  R$ 366,00
R$ 1.150,00            150                     6                  R$ 191,67
*/

package curso.java.heverton;

import java.util.Scanner;

public class DividaJurosParcelas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor inicial da dívida: ");
		double divida = scan.nextDouble();

		int percJuros = 0;
		double divComJuros;
		double valorJuros = 0;
		double valorParcela = 0;

		System.out.println("Valor da dívida | Valor dos juros | Quantidade de parcelas | Valor da parcela");

		for (int parcelas = 1; parcelas <= 12; parcelas++) {

			if (parcelas == 1) {

				percJuros = 0;

			}

			if (parcelas == 3) {

				percJuros = 10;

			}

			if (parcelas == 6) {

				percJuros = 15;

			}

			if (parcelas == 9) {

				percJuros = 20;

			}

			if (parcelas == 12) {

				percJuros = 25;

			}

			valorJuros = divida * ((double) percJuros / 100);
			divComJuros = divida + valorJuros;
			valorParcela = divComJuros / parcelas;

			if (parcelas != 1 && parcelas % 3 != 0) {

				continue;

			}

			System.out.printf("%2s%10.2f%5s%3s%10.2f%5s%11d%14s%3s%10.2f\n", "R$", divComJuros, "|", "R$", valorJuros,
					"|", parcelas, "|", "R$", valorParcela);

		}

	}

}
