package entities;

import java.text.DecimalFormat;

public class Produto {
	DecimalFormat df = new DecimalFormat("#.00");

	// Atributos
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;

	// Construtores
	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
		this.nome = nome;
	}

	public Produto() {
		super();
	}

	public Produto(int estoque) {
		super();
		this.estoque = estoque;
	}

	// Encapsuladores
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Métodos
	public void retirarEstoque(int qntd) {
		if (qntd > estoque) {
			System.out.println("\nQUANTIDADE INCORRETA!");
		} else {
			this.estoque -= qntd;
		}
	}

	public void adicionarEstoque(int qntd) {
			this.estoque += qntd;
	}

	public void pagamentos(int pagamento, double valorTotal) {

		double imposto = valorTotal;

		switch (pagamento) {
		case 1:
			valorTotal = valorTotal * 0.9;
			System.out.print("\n\t\t   ✧ NOTA FISCAL ✧\n\n");
			System.out.print("\t\t\nVALOR TOTAL: R$ " + df.format(valorTotal));
			imposto = valorTotal * 0.09;
			System.out.print("\t\t\n9% DE IMPOSTOS: R$ " + df.format(imposto));
			break;

		case 2:
			valorTotal = valorTotal * 1.1;
			System.out.print("\n\t\t   ✧ NOTA FISCAL ✧\n\n");
			System.out.print("\t\t\nVALOR TOTAL: R$ " + df.format(valorTotal));
			imposto = valorTotal * 0.09;
			System.out.print("\t\t\n9% DE IMPOSTOS: R$ " + df.format(imposto));
			break;

		case 3:
			valorTotal = (valorTotal * 1.15) / 2;
			System.out.print("\n\t\t   ✧ NOTA FISCAL ✧\n\n");
			System.out.print("\n\tPARCELADO EM 2X | 15% DE ACRÉSCIMO\n");
			System.out.print("\t\t\nVALOR TOTAL DE CADA PARCELA: R$ " + df.format(valorTotal));
			imposto = valorTotal * 0.09;
			System.out.print("\t\t\n9% DE IMPOSTOS: R$ " + df.format(imposto));
			break;

		default:
			break;
		}
	}

}
