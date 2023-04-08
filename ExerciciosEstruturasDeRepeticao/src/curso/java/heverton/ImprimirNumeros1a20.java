
/*Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro.*/

package curso.java.heverton;

public class ImprimirNumeros1a20 {

	public static void main(String[] args) {

		int cont = 0;

		// um número abaixo do outr0
		while (cont < 20) {

			cont++;
			System.out.println(cont);

		}

		cont = 0;

		// um número ao lado do outro
		while (cont < 20) {

			cont++;
			if (cont < 20) {
				System.out.print(cont + " - ");
			} else {
				System.out.print(cont);
			}
		
		}

	}

}
