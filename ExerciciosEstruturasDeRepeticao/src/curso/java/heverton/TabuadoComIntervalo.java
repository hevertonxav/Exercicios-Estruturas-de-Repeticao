
/*
 Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:

 o Montar a tabuada de: 5
 o Começar por: 4
 o Terminar em: 7

 o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
 o 5 X 4 = 20
 o 5 X 5 = 25
 o 5 X 6 = 30
 o 5 X 7 = 35
 
Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.
*/

package curso.java.heverton;

import java.util.Scanner;

public class TabuadoComIntervalo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		int tabuada;
		int inicio;
		int fim;
		
		System.out.println("Digite o numero da tabuada que deseja consultar: ");
		tabuada = scan.nextInt();
		
		do {
              
			System.out.println("Digite o inicio da tabuada: ");
			inicio = scan.nextInt();

			System.out.println("Digite o final da tabuada: ");
			fim = scan.nextInt();
			
			if(inicio < fim) {
				
				valido = true;
				
			} else {
				
				System.out.println("Números inválido, tabuada com o inicio maior do que o fim.");
				System.out.println("----------------------------------------------------------");

                valido = false;
			}
			
		} while (!valido);
		

		System.out.println("Montar a tabuada de: " + tabuada);
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em: " + fim);
		System.out.println(" ");

		
		for(int cont = inicio; cont <= fim; cont++ ) {
			
			System.out.println(tabuada + " X " + cont + " = " + (tabuada * cont));

		}

		
	


	}

}
