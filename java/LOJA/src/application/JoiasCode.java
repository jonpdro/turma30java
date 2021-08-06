package application;

import java.util.Scanner;

public class JoiasCode {
	public static void main(String[] args) {

		// variaveis
		final int TAM = 10;
		String produto[] = { "PULSEIRA ICY", "ANEL TOPÁZIO", "COlAR SAFIRA", "PULSEIRA LIZ", "ANEL CRISTAL",
				"BRINCO JASPE", "PINGENTE LUA", "COLAR AMÉLIA", "ANEL CRISTAL", "BRINCO ÁGATA" };
		String carrinho[] = new String[TAM];
		String codigo[] = new String[TAM];
		String auxCod = "", slogan = "✧ TRAZENDO SEU BRILHO INTERIOR ✧";

		char op, op1, op2, op3;

		Scanner leia = new Scanner(System.in);

		boolean formato = false;// Valor Booleano - Verdadeiro e Falso -

		double valores[] = { 70.99, 50.99, 39.99, 59.99, 65.59, 85.99, 45.59, 40.59, 99.59, 59.79 };
		double valorCompra[] = new double[TAM];
		double contador = 0.00;

		int estoque[] = new int[TAM];
		int contEstoque[] = new int[TAM];
		int auxQntd[] = new int[TAM]; // Cont

		// Entrada

		for (int x = 0; x < 10; x++) {

			codigo[x] = "G7-0" + (x + 1);
			auxQntd[x] = 0;
			contEstoque[x] = 0;
			estoque[x] = 10;

		}

		linha();
		// - Slogan - //
		System.out.print("\n\t\t    \n");
		nome();
		System.out.print("\n\n\t   " + slogan + "\n");
		linha();
		System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
		linha();
		System.out.print("CÓDIGO\t        PRODUTO\t\t   PREÇO\t  ESTOQUE\n");

		for (int x = 0; x < 10; x++) {
			System.out.printf("\n ", codigo[x], "\t  ", produto[x], "\t  ", valores[x], "\t  ", estoque[x]);
		}

		linha();
		System.out.println("\nDeseja Fazer Compras? ");
		System.out.println("\nDigite 'S' Para Sim e 'N' Para Não ");
		op = leia.next().toUpperCase().charAt(0);
		linha();

		if (op == 'S') {

			// COMEÇO DA PRIMEIRA FUNÇÃO DE FAZER COMPRAS

			do {

				System.out.println("\nDigite o Código do Produto");
				auxCod = leia.next().toUpperCase();
				for (int x = 0; x < 10; x++) {
					if (auxCod.equals(codigo[x])) {
						System.out.println("INFORME A QUANTIDADE QUE DESEJA: ");
						contEstoque[x] = leia.nextInt();
						auxQntd[x] += contEstoque[x];
						if (contEstoque[x] > estoque[x]) {
							auxQntd[x] = 0;
							linha();
							System.out.println("QUANTIDADE INVÁLIDA");
							System.out.println("\nO ESTOQUE É DE: " + estoque[x]);
						} else if (contEstoque[x] <= 0) {
							System.out.println("QUANTIDADE INVÁLIDA");
							System.out.println("\nO ESTOQUE É DE: " + estoque[x]);
						} else if (contEstoque[x] <= estoque[x]) {
							// VALIDAÇÃO E O PRIMEIRO CARRINHO DO CÓDIGO
							estoque[x] = estoque[x] - contEstoque[x];
							valorCompra[x] = valores[x] * auxQntd[x];
							linha();
							System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
							linha();
							System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");
							for (x = 0; x < 10; x++) {
								if (auxQntd[x] > 0) {
									System.out.println("\n " + codigo[x] + "\t     " + produto[x] + "\t  R$"
											+ Math.ceil(valorCompra[x]) + "\t    " + auxQntd[x]);
								}
							}

						}
					}
					/*
					 * if (auxCod != "G7-01" && auxCod != "G7-02" && auxCod != "G7-03") {
					 * System.out.println("Código invalido!"); break; }
					 */
				}
				// FUNÇÃO DE CONTINUAR COMPRANDO
				System.out.println("\nDESEJA CONTINUAR COMPRANDO?");
				System.out.println("\nDIGITE 'S' PARA SIM E 'N' PARA NÃO: ");
				op = leia.next().toUpperCase().charAt(0);
				linha();
			} while (op == 'S');
			if (op == 'S') {
				System.out.println("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
				linha();
				System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇO\t  ESTOQUE\n");
				for (int x = 0; x < 10; x++) {
					System.out.println(
							"\n " + codigo[x] + "\t     " + produto[x] + "\t   " + valores[x] + "\t    " + estoque[x]);
				}
				linha();

			}
		} else if (op == 'N') {

			linha();
			System.out.print("\n\t\t      \n");
			nome();
			System.out.print("\n\n\t     " + slogan + "\n");
			linha();
			System.out.println("\t\t Até Breve amigão!!");

		} else {
			System.out.println("Opção Invalida");

		}

	}

	// Função Slogan - Mostra no INICIO -
	public static void nome() {

		System.out.print("\t\t☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t\t☆    ╔═══════════════════╗  ☆\n");
		System.out.print("\t\t☆    ❝    JÓIAS CODE ❞       ☆\n");
		System.out.print("\t\t☆    ╚═══════════════════╝  ☆\n");
		System.out.print("\t\t☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");

	}// Função Linha - Separação das opções -

	public static void linha() {
		System.out.println("\n══════════════════════════════════════════════════════════\n");
	}
}
