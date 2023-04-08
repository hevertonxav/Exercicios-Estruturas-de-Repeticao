
/*Faça um programa que mostre todos os primos entre 1 e N sendo N
um número inteiro fornecido pelo usuário. O programa deverá mostrar
também o número de divisões que ele executou para encontrar os
números primos. Serão avaliados o funcionamento, o estilo e o número
de testes (divisões) executados.*/

package curso.java.heverton;

import java.util.Scanner;

public class NumerosPrimosIntervalos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N;
		int div = 0;
		int naoDiv = 0;

		System.out.println("Digite até qual número vc deseja encontrar os primos: ");
		N = scan.nextInt();

		for (int i = 1; i <= N; i++) {

			int divisivel = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {

					divisivel++;
					div++;
                   
				} else {
					
					naoDiv++;
					
				}

			}

			if (divisivel == 2) {

				System.out.print(i + " ");
			
			
			} 
			
		}
		
		System.out.println(" ");

		System.out.print("Número de divisões: " + (div + naoDiv) );

	}

}
