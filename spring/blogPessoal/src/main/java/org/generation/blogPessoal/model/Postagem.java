package org.generation.blogPessoal.model;

// Bibliotecas importadas do Java e do JPA
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // -> Idenficação que essa classe é uma tabela dentro do banco de dados
@Table(name = "tb_postagem") // -> Nome da Entity/Tabela no banco
public class Postagem {

	@Id // -> A variavel sera do tipo primary key no banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) // -> Atribuindo o auto_increment para essa variavel no banco
	private long id;

	@NotBlank // -> A variavel não aceita valores nulos ou em branco como dados dentro do
				// banco
	@Size(min = 5, max = 100) // -> Tamanho minimo e maximo de caracteres do dado no banco
	private String titulo;

	@NotBlank
	@Size(min = 10, max = 500)
	private String texto;

	@Temporal(TemporalType.TIMESTAMP) // -> Indicando que a variavel trabalha com datas reais (MM/DD/YYYY HH:MM:SS)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne // -> Relacionamento "Muitos para Um" com o Tema
	@JsonIgnoreProperties("postagem") // -> Anotação para não ter repercursividade no HTTP
	private Tema tema;
	
	// GETTERS AND SETTERS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
