
/*Faça um programa que mostre os n termos da Série a seguir:
o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
Imprima no final a soma da série.*/

package curso.java.heverton;

import java.util.Scanner;

public class SomaSerie {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double soma = 0;

		System.out.println("Digite o n termos que deseja encontrar: ");
		int n = scan.nextInt();

		System.out.print("S = ");

		for (int i = 1, j = 1; i <= n; i++, j += 2) {

			soma += ((double)i / j);

			if (i == n) {
				
				System.out.print(i + "/" + j );
			
			} else {
				
				System.out.print(i + "/" + j + " + ");

			}
			
		}
		
		System.out.println(" ");
		System.out.printf("%s%.2f","A soma da série é: ", soma);


	}

}
