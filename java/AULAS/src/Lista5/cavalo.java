package Lista5;

public class cavalo extends animal {

	private String nome;
	private int idade;

	public cavalo(String raca, String andar, String ossos, String nome, int idade) {
		super(raca, andar, ossos);
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
