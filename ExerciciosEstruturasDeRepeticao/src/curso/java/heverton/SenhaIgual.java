
/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/

package curso.java.heverton;

import java.util.Scanner;

public class SenhaIgual {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;

		while (!infoValida) {
            
			System.out.println("Usuário: ");
			String usuario = scan.next();

			System.out.println("Senha: ");
			String senha = scan.next();

			if (usuario.equals(senha)) {

				infoValida = false;
				System.out.println("Usuário e senha iguais, digite as informações novamente");

			} else {
                
				infoValida = true;
				System.out.println("Usuário e senhas válidos ");

			}
		}

	}

}
