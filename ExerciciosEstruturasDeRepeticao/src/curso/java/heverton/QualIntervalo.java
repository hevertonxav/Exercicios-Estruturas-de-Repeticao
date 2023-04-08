
/*Faça um programa que leia uma quantidade indeterminada de
números positivos e conte quantos deles estão nos seguintes
intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados
deverá terminar quando for lido um número negativo.*/

package curso.java.heverton;

import java.util.Scanner;

public class QualIntervalo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
 
		int n = 0;
		int cont = 0;
		int intervalo1 = 0; //[0-25]
		int intervalo2 = 0; //[26-50]
		int intervalo3 = 0; //[51-75]
		int intervalo4 = 0; //[76-100]
		
		do {
		    
			cont++;
			
			System.out.println("Digite o " + cont + "º número: ");
		    n = scan.nextInt();
		    
		    if(n > 0 && n <= 25) {
		    	intervalo1++;
		    }
		    
		    if(n > 25  && n <= 50) {
		    	intervalo2++;
		    }
		    
		    if(n > 51 && n <= 75) {
		    	intervalo3++;
		    }
		    
		    if(n > 76 && n <= 100) {
		    	intervalo4++;
		    }
		    
		 } while (n > 0);
		
		System.out.println("Quantidade de números no intervalo [0 - 25]: " + intervalo1);
		System.out.println("Quantidade de números no intervalo [26 - 50]: " + intervalo2);
		System.out.println("Quantidade de números no intervalo [51 - 75]: " + intervalo3);
		System.out.println("Quantidade de números no intervalo [76 - 100]: " + intervalo4);

		
	}

}
