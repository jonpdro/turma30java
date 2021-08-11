package entities;

public class produto {

	private String codigo;
	private String nome;
	private double valor;
	private int estoque;

	public produto(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if(estoque < 0) {
			this.estoque = 0;
		} else {
			this.estoque = estoque;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public void retirarEstoque(int qntd) {
		if(qntd > estoque) {
			System.out.println("ROLA NAO");
		} else {
			this.estoque -= qntd;
		}
	}
	public void incluirEstoque(int qntd) {
		if(qntd < estoque) {
			System.out.println("ROLA NAO");
		} else {
			this.estoque += qntd;
		}
	}
	
	
	
	
	
	
	
	
	
}
