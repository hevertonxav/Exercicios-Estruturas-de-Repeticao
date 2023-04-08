
/*
O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.
*/

package curso.java.heverton;

import java.util.Scanner;

public class TemperaturasMaiorMenorMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de temperaturas: ");
		int n = scan.nextInt();

		int i = 0;
		double soma = 0;
		double media = 0;
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;

		do {
            
			i++;
			
			System.out.println("Digite a " + i + " temperatura: ");
			double temperatura = scan.nextDouble();

			if (temperatura > maior) {

				maior = temperatura;

			}

			if (temperatura < menor) {

				menor = temperatura;

			}

			soma += temperatura;
			media = (double) soma / i;

		} while (i < n);

		System.out.println("Maior temperatura: " + maior + " °C");
		System.out.println("Menor temperatura: " + menor + " °C");
		System.out.println("Média: " + media + " °C");

	}

}
