package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // -> Mostrando que a classe se trata de um Controller da API
@RequestMapping("/postagens") // -> Anotaçao que faz por qual aquisição será acessada esse controller
@CrossOrigin(origins = "*", allowedHeaders = "*") // -> Fazer a classe aceitar requisições de qualquer origem
public class PostagemController {

	@Autowired // -> Serviço de injeção de independencia do Spring
	private PostagemRepository repository; // -> Instanciando a interface que possui os metodos Repository do JPA

	@GetMapping // -> Aquisição do método GET de todas as postagens
	public ResponseEntity<List<Postagem>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}") // -> Aquisição do método GET específica para o Id da postagem
	public ResponseEntity<Postagem> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		/*
		 * @PathVariable = Anotação para que o aceite uma váriavel no parametro do método GET 
		 * .map = Aplicação da função de mapeamento fornecida ao valor {resp} retornando o método 
		 * .orElse = Se a condição do método não for true (.map), retornará uma mensagem de erro HTTP
		 */
	}

	@GetMapping("/titulo/{titulo}") // -> Aquisição do método GET específica para o Titulo da postagem
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}

	@PostMapping // -> Aquisição do método POST para INSERIR dados diretamente dentro do banco de dados
	public ResponseEntity<Postagem> post(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		/*
		 * RequestBody = Anotação para receber um objeto postagem como parametro do método (a tabela "tb_postagem" do banco)
		 */
	}

	@PutMapping // -> Aquisição do método PUT para ALTERAR dados diretamente dentro do banco de dados
	public ResponseEntity<Postagem> put(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}

	@DeleteMapping("/{id}") // -> Aquisição do método DELETE para APAGAR um dado especifico do banco através do ID
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
