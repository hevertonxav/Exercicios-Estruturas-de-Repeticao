
/*Faça um programa que leia 5 números e informe a soma e a média
dos números.*/

package curso.java.heverton;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cont = 0;
		int numero;
		double media = 0;
		int soma = 0;

		while (cont < 5) {

			cont++;

			System.out.println("Digite o " + cont + "° número:");
			numero = scan.nextInt();

			soma += numero;
			media = (double) soma / cont;

		}
        
		System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

	}

}
