package programas;

import entidades.produto;

public class CadProduto {

	public static void main(String[] args) {
		
		produto prod1 = new produto("G7-01", "PULSEIRA ICY", 70.99, 10);
		
		System.out.println(prod1.getEstoque());
		
		prod1.retirarEstoque(15);
		System.out.println(prod1.getEstoque());
		
		prod1.incluirEstoque(10);
		System.out.println(prod1.getEstoque());
	}

}
