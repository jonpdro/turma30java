package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class JoiasCode {

	public static void main(String[] args) {

		/*
		 * Produto produto1 = new Produto("G7-01", 70.99, 10, "PULSEIRA ICY"); Produto
		 * produto2 = new Produto("G7-02", 70.99, 10, "ANEL TOPÁZIO"); Produto produto3
		 * = new Produto("G7-03", 70.99, 10, "COlAR SAFIRA"); Produto produto4 = new
		 * Produto("G7-04", 70.99, 10, "PULSEIRA LIZ"); Produto produto5 = new
		 * Produto("G7-05", 70.99, 10, "ANEL CRISTAL"); Produto produto6 = new
		 * Produto("G7-06", 70.99, 10, "BRINCO JASPE"); Produto produto7 = new
		 * Produto("G7-07", 70.99, 10, "PINGENTE LUA"); Produto produto8 = new
		 * Produto("G7-08", 70.99, 10, "COLAR AMÉLIA"); Produto produto9 = new
		 * Produto("G7-09", 70.99, 10, "ANEL CRISTAL"); Produto produto10 = new
		 * Produto("G7-10", 70.99, 10, "BRINCO ÁGATA");
		 *
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 * System.out.println(produto10.getCodigo(), produto10.getValor(),
		 * produto10.getEstoque(), produto10.getNome());
		 */

		Scanner leia = new Scanner(System.in);

		char op;
		char op2;
		String auxCod;
		int auxQntd[] = new int[10];
		int contEstoque[] = new int[10];

		Produto[] produtos = new Produto[] { new Produto("G7-01", "PULSEIRA ICY", 70.99, 10),
				new Produto("G7-02", "ANEL TOPÁZIO", 50.99, 10), new Produto("G7-03", "COlAR SAFIRA", 39.99, 10),
				new Produto("G7-04", "PULSEIRA LIZ", 59.99, 10), new Produto("G7-05", "ANEL CRISTAL", 65.59, 10),
				new Produto("G7-06", "BRINCO JASPE", 85.99, 10), new Produto("G7-07", "PINGENTE LUA", 45.59, 10),
				new Produto("G7-08", "COLAR AMÉLIA", 40.59, 10), new Produto("G7-09", "ANEL CRISTAL", 99.59, 10),
				new Produto("G7-10", "BRINCO ÁGATA", 59.79, 10)};
		

		linha();
		System.out.print("\n\t\t    \n");
		nome();
		linha();
		System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
		linha();
		System.out.print("CÓDIGO\t        PRODUTO\t\t  PREÇO\t    ESTOQUE");
		for (Produto produto : produtos) {
			produto.tabela();
		}

		linha();
		System.out.println("DESEJA FAZER COMPRAS? ");
		System.out.print("\n(DIGITE 'S' PARA SIM E 'N' PARA NÃO): ");
		op = leia.next().toUpperCase().charAt(0);
		linha();

		if (op == 'S') {
			// COMEÇO DA PRIMEIRA FUNÇÃO DE FAZER COMPRAS
			do {
				System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
				auxCod = leia.next().toUpperCase();

				for (int x = 0; x < 10; x++) {
					if (auxCod.equals(produtos[x].getCodigo())) {
						/* System.out.println(produtos[x].getCodigo()); */
						System.out.print("INFORME A QUANTIDADE QUE DESEJA: ");
						auxQntd[x] = leia.nextInt();

						for (x = 0; x < 10; x++) {
							if (auxCod.equals(produtos[x].getCodigo())) {
								if (auxQntd[x] > produtos[x].getEstoque()) {
									auxQntd[x] = 0;
									linha();
									System.out.println("QUANTIDADE INVÁLIDA");
									System.out.println("\nO ESTOQUE É DE: " + produtos[x].getEstoque());

								} else if (auxQntd[x] <= 0) {
									System.out.println("QUANTIDADE INVÁLIDA");
									System.out.println("\nO ESTOQUE É DE: " + produtos[x].getEstoque());

								} else if (auxQntd[x] <= produtos[x].getEstoque()) {
									produtos[x].retirarEstoque(auxQntd[x]);
									linha();
									System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
									for (x = 0; x < 10; x++) {
										if (auxQntd[x] > 0) {
											System.out.print("\n " + produtos[x].getCodigo() + "\t\t"
													+ produtos[x].getNome() + "\t  " + produtos[x].getValor()
													+ "\t       " + auxQntd[x]);
										}
									}
									linha();
								}
							}
						}
					}
					if (auxCod.equals("G7-01") == false && auxCod.equals("G7-02") == false
							&& auxCod.equals("G7-03") == false && auxCod.equals("G7-04") == false
							&& auxCod.equals("G7-05") == false && auxCod.equals("G7-06") == false
							&& auxCod.equals("G7-07") == false && auxCod.equals("G7-08") == false
							&& auxCod.equals("G7-09") == false && auxCod.equals("G7-010") == false) {
						System.out.println("CÓDIGO INVÁLIDO!");
						break;
					}
				}
				// FUNÇÃO DE CONTINUAR COMPRANDO
				System.out.println("DESEJA CONTINUAR COMPRANDO?");
				System.out.print("\nDIGITE 'S' PARA SIM E 'N' PARA NÃO: ");
				op = leia.next().toUpperCase().charAt(0);
				linha();

				if (op == 'S') {
					System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
					linha();
					System.out.print("CÓDIGO\t        PRODUTO\t\t  PREÇO\t    ESTOQUE");
					for (Produto produto : produtos) {
						produto.tabela();
					}
				}

			} while (op == 'S');

			if (op == 'N') {
				System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
				for (int x = 0; x < 10; x++) {
					if (auxQntd[x] > 0) {
						System.out.print("\n " + produtos[x].getCodigo() + "\t\t" + produtos[x].getNome() + "\t  "
								+ produtos[x].getValor() + "\t       " + auxQntd[x]);
					}
				}
				linha();
				System.out.print("\nDESEJA MODIFICAR O PEDIDO?");
				System.out.print("\nDIGITE 'S' PARA SIM OU 'N' PARA NÃO: ");
				op2 = leia.next().toUpperCase().charAt(0);

				while (op2 == 'S') {

					System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
					auxCod = leia.next().toUpperCase();

					for (int x = 0; x < 10; x++) {
						if (auxCod.equals(produtos[x].getCodigo())) {
							auxQntd[x] = 0;
							System.out.print("\nINFORME A QUANTIDADE QUE DESEJA RETIRAR DO PRODUTO: ");
							auxQntd[x] = leia.nextInt();
							produtos[x].modificaEstoque(auxQntd[x]);
						}
					}

					System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
					linha();
					System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");
					for (int x = 0; x < 10; x++) {
						if (auxQntd[x] > 0) {
							System.out.print("\n " + produtos[x].getCodigo() + "\t\t" + produtos[x].getNome() + "\t  " + produtos[x].getValor() + "\t       " + auxQntd[x]);
						}
					}
					System.out.print("\nDESEJA CONTINUAR MODIFICANDO?");
					System.out.print("\nDIGITE 'S' PARA SIM OU 'N' PARA NÃO: ");
					op2 = leia.next().toUpperCase().charAt(0);
				}
			}
		}
//				for (int x = 0; x < 10; x++) {
//					contador += (auxQntd[x] * valores[x]);
//				}

//				if (contador != 0) {
//					System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
//					linha();
//					System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");
//
//					for (int y = 0; y < 10; y++) {
//						if (auxQntd[y] > 0) {
//							System.out.print("\n " + codigo[y] + "\t     " + produto[y] + "\t  R$"
//									+ df.format(valorCompra[y]) + "\t    " + auxQntd[y]);
//						}
//
//					}
//					// FINALIZAÇÃO DAS COMPRAS
//					linha();
//					System.out.printf("\t   VALOR TOTAL DA COMPRA: R$ %.2f", contador);
//					linha();
//					System.out.print("\t\tFORMA DE PAGAMENTOS:\n\n");
//					System.out.print(" OPÇÃO 1 - A VISTA COM 10% DESCONTO\n");
//					System.out.print(" OPÇÃO 2 - NO CARTÃO COM ACRESCIMO DE 10%\n");
//					System.out.print(" OPÇÃO 3 - EM 2X COM 15% TOTAL DE ACRESCIMENTO\n");
//					linha();
//			}
//		}
	}

	// Função Slogan - Mostra no INICIO -
	public static void nome() {

		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t    ☆   ╔════════════════════╗	  ☆\n");
		System.out.print("\t    ☆    ❝    JÓIAS CODE     ❞	  ☆\n"); // GAMBIARRA!!!!!!!!!!!!!!
		System.out.print("\t    ☆   ╚════════════════════╝	  ☆\n"); // NÃO MEXER!!!!!!!!!!!!!!!!
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\n\t   ✧ TRAZENDO SEU BRILHO INTERIOR ✧");
	}// Função Linha - Separação das opções -

	public static void linha() {
		System.out.println("\n══════════════════════════════════════════════════════════\n");
	}

}
