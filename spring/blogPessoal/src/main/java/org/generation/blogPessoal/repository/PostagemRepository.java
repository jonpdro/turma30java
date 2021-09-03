package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // -> Boa prática indicar que essa interface é um Repository no JPA (Opcional)
public interface PostagemRepository extends JpaRepository<Postagem, Long>{ // -> extends = Importando todos os métodos de Repository do JPA
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); // -> Método abstrato (método que não possui um chaves/corpo)

	/*
	 *  findAllBy = Função para "PESQUISAR TUDO PELO {titulo}" do prório JPA
	 *  Containing = Todo {titulo} que conter o caracter indicado dentro do (String titulo) será puxado pelo findAllBy
	 *  IgnoreCase = Ignora se o dados inserido no (String titulo) possui letra maiuscula ou minuscula
	 *  
	 * */
}
