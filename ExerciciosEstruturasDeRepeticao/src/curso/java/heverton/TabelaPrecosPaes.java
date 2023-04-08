
/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver o programa que monta
a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
informado pelo usuário, conforme o exemplo abaixo:
 - Preço do pão: R$ 0.18
 - Panificadora Pão de Ontem - Tabela de preços
    1 - R$ 0.18
    2 - R$ 0.36
      ...
    50 - R$ 9.00*/



package curso.java.heverton;

import java.text.DecimalFormat;

public class TabelaPrecosPaes {

	public static void main(String[] args) {
		
		System.out.println("Preço do pão: R$ 0.18");
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");

		int i = 0;
		double preco;

		DecimalFormat df = new DecimalFormat("####0.00");

		do {

			i++;
			preco = i * 0.18;

			System.out.println(i + " - " + "R$ " + df.format(preco));

		} while (i < 50);

	}

}
