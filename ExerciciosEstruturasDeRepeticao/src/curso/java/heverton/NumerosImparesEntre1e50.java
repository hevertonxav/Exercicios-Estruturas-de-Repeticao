
/*Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50.*/

package curso.java.heverton;

public class NumerosImparesEntre1e50 {

	public static void main(String[] args) {
		
		int numero = 0;

		while (numero < 50) {

			numero++;

			if(numero % 2 != 0) {
				
				System.out.print(numero + " ");
				
			}

		}
		
		

	}

}
