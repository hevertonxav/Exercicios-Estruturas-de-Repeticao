
/*Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/

//Altere o programa para mostrar no final a soma dos números.


package curso.java.heverton;

import java.util.Scanner;

public class IntervaloEntreNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int soma = 0;

		System.out.println("Digite o primeiro número:");
		int n1 = scan.nextInt();

		System.out.println("Digite o segundo número:");
		int n2 = scan.nextInt();
	

		if (n1 <= n2) {

			while (n1 <= n2) {
                
				soma += n1;
                System.out.print(n1++ + " ");
				
			}

		} else {

			while (n2 <= n1) {
                
				soma += n1;
				System.out.print(n1-- + " ");
                
			}

		}
		
		System.out.println(" ");

		System.out.print("Soma: " + soma);


	}

}
