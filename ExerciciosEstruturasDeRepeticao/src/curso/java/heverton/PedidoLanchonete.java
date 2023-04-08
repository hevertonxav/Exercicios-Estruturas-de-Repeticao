
/*O cardápio de uma lanchonete é o seguinte:
 
 - Especificação    Código  Preço
 - Cachorro Quente   100    R$ 1,20
 - Bauru Simples     101    R$ 1,30
 - Bauru com ovo     102    R$ 1,50
 - Hambúrguer        103    R$ 1,20
 - Cheeseburguer     104    R$ 1,30
 - Refrigerante      105    R$ 1,00

Faça um programa que leia o código dos itens pedidos e as
quantidades desejadas. Calcule e mostre o valor a ser pago por
item (preço * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser
encerrado.*/

package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PedidoLanchonete {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean pedidoEncerrado = false;
		int qtde;
		int refri = 0;
		double preco;
		double valor = 0;
		double valorTotal = 0;
		String output = " \n";
	
		DecimalFormat df = new DecimalFormat("###0.00");

		do {

			System.out.println("O que o cliente deseja? ");
			int item = scan.nextInt();

			switch (item) {

			case 100:

				System.out.println("Digite a quantidade de cachorro quente: ");
				qtde = scan.nextInt();

				preco = 1.2;
				valor = qtde * preco;
				output += qtde + " x CACHORRO-QUENTE: R$ " + df.format(valor) + "\n";
				

				break;

			case 101:

				System.out.println("Digite a quantidade de bauru simples: ");
				qtde = scan.nextInt();

				preco = 1.3;
				valor = qtde * preco;
				output += qtde + " x BAURU SIMPLES: R$ " + df.format(valor) + "\n";
				

				break;

			case 102:

				System.out.println("Digite a quantidade de bauru com ovo: ");
				qtde = scan.nextInt();

				preco = 1.5;
				valor = qtde * preco;
				output += qtde + " x BAURU COM OVO: R$ " + df.format(valor) + "\n";
			

				break;

			case 103:

				System.out.println("Digite a quantidade de hamburger: ");
				qtde = scan.nextInt();

				preco = 1.2;
				valor = qtde * preco;
				output += qtde + " x HAMBURGUER: R$ " + df.format(valor) + "\n";
				

				break;

			case 104:

				System.out.println("Digite a quantidade de cheeseburguer: ");
				qtde = scan.nextInt();

				preco = 1.3;
				valor = qtde * preco;
				output += qtde + " x CHEESEBURGUER: R$ " + df.format(valor) + "\n";
	

				break;

			case 105:

				System.out.println("Digite a quantidade de refrigerante: ");
				qtde = scan.nextInt();

				preco = 1;
				valor = qtde * preco;
				output += qtde + " x REFRIGERANTE: R$ " + df.format(valor) + "\n";

				break;

			default:

				System.out.println("Código inválido");
                
			}
			
			valorTotal += valor;


			boolean opcaoValida = false;

			do {

				System.out.println("O cliente deseja mais alguma coisa? [ S - sim / N - não]");
				String opcao = scan.next();

				if (opcao.equalsIgnoreCase("s")) {

					pedidoEncerrado = false;
					opcaoValida = true;

				} else if (opcao.equalsIgnoreCase("n")) {

					pedidoEncerrado = true;
					opcaoValida = true;

				} else {

					System.out.println("Opção inválida.");

					pedidoEncerrado = false;
					opcaoValida = false;

				}

			} while (!opcaoValida);

		} while (!pedidoEncerrado);

		System.out.println(output);
		System.out.println("VALOR TOTAL: R$ " + df.format(valorTotal));

	}

}
