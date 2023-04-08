
/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
conforme o exemplo abaixo:
 
 Fatorial de: 5
 5! = 5 . 4 . 3 . 2 . 1 = 120
*/

package curso.java.heverton;

import java.util.Scanner;

public class OutroExercicioFatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número que deseja obter o fatorial: ");
		int n = scan.nextInt();

		int fatorial = 1;

		System.out.println("Fatorial de: " + n);
		System.out.print(n + "! = ");

		if (n == 0) {

			fatorial = 1;

		} else {
			
			do {
				if (n > 1) {

					System.out.print(n + " . ");

				} else {

					System.out.print(n + " = ");

				}

				fatorial *= n;
				n--;

			} while (n > 0);
		
		}
		
		System.out.print(fatorial);

	}

}
