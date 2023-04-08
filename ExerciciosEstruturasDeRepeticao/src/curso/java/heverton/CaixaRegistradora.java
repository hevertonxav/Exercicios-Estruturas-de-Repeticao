
/*O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
- Lojas Tabajara
- Produto 1: R$ 2.20
- Produto 2: R$ 5.80
- Produto 3: R$ 0
- Total: R$ 8.00
- Dinheiro: R$ 20.00
- Troco: R$ 12.00
- ...
*/


package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CaixaRegistradora {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	    
		String output = "Lojas Tabajara \n ";
		output += "\n";
		
		int i = 0;
		double preco = 0;
		double total = 0;
		double valorPago;
		double troco;
		
		DecimalFormat df = new DecimalFormat("####0.00");

		do {
			i++;
			
			System.out.println("Digite o preço do produto " + i +" :");
			preco = scan.nextDouble();
			
			output += "Produto " + i + ": R$ " + df.format(preco) + "\n";
			
			total += preco;
			
		} while (preco != 0);
		
		System.out.println("Digite o valor pago pelo cliente:");
		valorPago = scan.nextDouble();
		
		troco = valorPago - total;
				
		System.out.print(output);
		System.out.println("Total: R$ " + df.format(total));
		System.out.println("Dinheiro: R$ " + df.format(valorPago));
		System.out.println("Troco: R$ " + df.format(troco));

	}

}
