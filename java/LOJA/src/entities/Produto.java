package entities;

public class Produto {

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

	public Produto(String codigo, int estoque) {
		super();
		this.codigo = codigo;
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
			System.out.println("VAI DÁ NAO");
		} else {
			this.estoque -= qntd;
		}
	}
	

	public void adicionaEstoque(int qntd) {
		if (qntd > estoque) {
			System.out.println("VAI DÁ NAO");
		} else {
			this.estoque += qntd;
		}
	}
}
