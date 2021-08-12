package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class JoiasCode2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<Produto> itens = new ArrayList<Produto>();
		List<Produto> carrinho = new ArrayList<>(10);

		String auxCod;
		int posicao;

		itens.add(new Produto("G7-01", "PULSEIRA ICY", 70.99, 10));
		itens.add(new Produto("G7-02", "ANEL TOPÁZIO", 50.99, 10));
		itens.add(new Produto("G7-03", "COlAR SAFIRA", 39.99, 10));
		itens.add(new Produto("G7-04", "PULSEIRA LIZ", 59.99, 10));
		itens.add(new Produto("G7-05", "ANEL CRISTAL", 65.59, 10));
		itens.add(new Produto("G7-06", "BRINCO JASPE", 85.99, 10));
		itens.add(new Produto("G7-07", "PINGENTE LUA", 45.59, 10));
		itens.add(new Produto("G7-08", "COLAR AMÉLIA", 40.59, 10));
		itens.add(new Produto("G7-09", "ANEL CRISTAL", 99.59, 10));
		itens.add(new Produto("G7-10", "BRINCO ÁGATA", 59.79, 10));

		System.out.print("CODIGO: ");
		auxCod = leia.next().toUpperCase();

	}

}
