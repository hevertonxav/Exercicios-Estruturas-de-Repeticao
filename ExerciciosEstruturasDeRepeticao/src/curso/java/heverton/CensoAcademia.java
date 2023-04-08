/*
Uma academia deseja fazer um censo entre seus clientes para
descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para
isto você deve fazer um programa que pergunte a cada um dos
clientes da academia seu código, sua altura e seu peso. O final da
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no
campo código. Ao encerrar o programa também deve ser informados
os códigos e valores do cliente mais alto, do mais baixo, do mais gordo
e do mais magro, além da média das alturas e dos pesos dos clientes.
*/

package curso.java.heverton;

import java.util.Scanner;

public class CensoAcademia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		String codigo;
		double altura;
		double peso = 0;
		double somaAlturas = 0;
		double somaPesos = 0;
		double mediaAlturas = 0;
		double mediaPesos = 0;
		double maisBaixo = Integer.MAX_VALUE;
		double maisAlto = Integer.MIN_VALUE;
		double maisMagro = Integer.MAX_VALUE;
		double maisGordo = Integer.MIN_VALUE;
		String codMaisBaixo = null;
		String codMaisAlto = null;
		String codMaisMagro = null;
		String codMaisGordo = null;
		

		do {

			i++;

			System.out.println("Digite o código do " + i + "º cliente: ");
			codigo = scan.next();

			if (!codigo.equalsIgnoreCase("0")) {

				System.out.println("Digite a altura do " + i + "º cliente (em m): ");
				altura = scan.nextDouble();
				System.out.println("Digite o peso do " + i + "º cliente (em Kg): ");
				peso = scan.nextDouble();
				System.out.println("-------------------------------------");
                
				if (altura < maisBaixo) {
                    
					codMaisBaixo = codigo;
					maisBaixo = altura;

				}

				if (altura > maisAlto) {
					
					codMaisAlto = codigo;
					maisAlto = altura;

				}
				
				if (peso < maisMagro) {
                    
					codMaisMagro = codigo;
					maisMagro = peso;

				}

				if (peso > maisGordo) {
                    
					codMaisGordo = codigo;
					maisGordo = peso;

				}
				
				somaAlturas += altura;
				somaPesos += peso;
				
				mediaAlturas = somaAlturas/i;
				mediaPesos = somaPesos/i;
			
			}

		} while (!codigo.equalsIgnoreCase("0"));
		
		System.out.println("CLIENTE MAIS BAIXO");
		System.out.println("Código: " + codMaisBaixo);
		System.out.println("Altura: " + maisBaixo + " m");
		
		System.out.println(" ");
		
		System.out.println("CLIENTE MAIS ALTO");
		System.out.println("Código: " + codMaisAlto);
		System.out.println("Altura: " + maisAlto + " m");
		
		System.out.println(" ");
		
		System.out.println("CLIENTE MAIS MAGRO");
		System.out.println("Código: " + codMaisMagro);
		System.out.println("Peso: " + maisMagro + " Kg");
		
		System.out.println(" ");
		
		System.out.println("CLIENTE MAIS GORDO");
		System.out.println("Código: " + codMaisGordo);
		System.out.println("Peso: " + maisGordo + " Kg");
		
		System.out.println(" ");
		
		System.out.println("MÉDIA DAS ALTURAS: " + mediaAlturas + " m" );
		System.out.println("MÉDIA DOS PESOS: " + mediaPesos + " Kg");
		
	}

}
