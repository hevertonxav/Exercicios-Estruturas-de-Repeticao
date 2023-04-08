
/*A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.*/

package curso.java.heverton;

import java.util.Scanner;

public class FibonacciMaiorQue500 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n1 = 1;
		int n2 = 1;
		int n3 = 2;

		System.out.print(n1 + " " + n2 + " " + n3 + " ");

		while (n3 < 500) {

			n1 = n2;
			n2 = n3;

			n3 = n1 + n2;

			System.out.print(n3 + " ");

		}

	}

}
