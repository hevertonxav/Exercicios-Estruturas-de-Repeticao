
/*Faça um programa que leia e valide as seguintes informações:
   a. Nome: maior que 3 caracteres;
   b. Idade: entre 0 e 150;
   c. Salário: maior que zero;
   d. Sexo: 'f' ou 'm';
   e. Estado Civil: 's', 'c', 'v', 'd';*/

package curso.java.heverton;

import java.util.Scanner;

public class CadastroValido {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;

		while (!infoValida) {

			System.out.println("Nome: ");
			String nome = scan.next();

			if (nome.length() > 3) {

				infoValida = true;

			} else {

				System.out.println("Nome inválido, tem que ter mais do que 3 caracteres");

			}
		}

		infoValida = false;

		while (!infoValida) {

			System.out.println("Idade: ");
			int idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {

				infoValida = true;

			} else {

				System.out.println("Idade inválida, tem que ser entre 0 e 150");

			}
		}

		infoValida = false;

		while (!infoValida) {

			System.out.println("Salário: ");
			double salario = scan.nextDouble();

			if (salario > 0) {

				infoValida = true;

			} else {

				System.out.println("Salário inválido, tem que ser maior do que zero");

			}
		}

		infoValida = false;

		while (!infoValida) {

			System.out.println("Sexo: ");
			String sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {

				infoValida = true;

			} else {

				System.out.println("Sexo inválido, digite M ou F");

			}
		}

		infoValida = false;

		while (!infoValida) {

			System.out.println("Estado civil: ");
			String estCivil = scan.next();

			if (estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || estCivil.equalsIgnoreCase("v")
					|| estCivil.equalsIgnoreCase("d")) {

				infoValida = true;

			} else {

				System.out.println("Estado civil inválido, digite S, C, V ou D");

			}
		}

	}

}
