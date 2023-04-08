
/*A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.*/

package curso.java.heverton;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n1 = 1;
		int n2 = 1;
		int n3 = 2;
		int i = 3;

		System.out.println("Digite o termo que deseja encontrar: ");
		int termo = scan.nextInt();

		switch (termo) {

		case 1:
			
			System.out.print(n1 + " ");
			break;
		
		case 2:
			
			System.out.print(n1 + " " + n2 + " ");
			break;
		
		case 3:
			
			System.out.print(n1 + " " + n2 + " " + n3 + " ");
		    break;
		    
		default:

			System.out.print(n1 + " " + n2 + " " + n3 + " ");

			while (i < termo) {

				i++;

				n1 = n2;
				n2 = n3;

				n3 = n1 + n2;

				System.out.print(n3 + " ");

			}

		}

	}

}
