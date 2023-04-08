
/*Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.*/

package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ColecaoCds {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de CDs da coleção: ");
		int n = scan.nextInt();

		int i = 0;
		int soma = 0;
		double media = 0;

		do {

			i++;

			System.out.println("Entre com o preço do CD " + i + " (R$): ");
			double preco = scan.nextDouble();

			soma += preco;
			media = (double) soma / i;

		} while (i < n);
        
	    DecimalFormat df = new DecimalFormat("####0.00");

		System.out.println("Valor médio: R$ " + df.format(media));

	}
}
