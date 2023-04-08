
/*Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
calcule o valor de H com N termos.*/


package curso.java.heverton;

import java.util.Scanner;

public class ValorSomaH {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double H = 0; // H é a soma dos termos

		System.out.println("Digite o N termos que deseja encontrar: ");
		int N = scan.nextInt();

		System.out.print("H = ");

		for (int i = 1; i <= N; i++) {

			H += ((double)1 / i);

			if (i == N) {
				
				System.out.print("1/" + i );
			
			} else {
				
				System.out.print("1/" + i + " + ");

			}
			
		}
		
		System.out.println(" ");
		System.out.printf("%s%.2f","A soma da série é: ", H);

		

	}

}
