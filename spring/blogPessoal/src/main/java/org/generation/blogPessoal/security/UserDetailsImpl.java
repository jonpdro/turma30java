package org.generation.blogPessoal.security;

import java.util.Collection;
import org.generation.blogPessoal.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails{
	
	private static final long serialVersionUID = 1L; // -> Classe para controle interno
	
	// Classes para os atributos privados
	private String userName;
	private String password;
	
	/* Collection de Role, permissões para usuario que não será usada.
	 * private List<GrantedAuthority> authorities;
	 * */
	
	// Construtor de classe
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}
	
	// Construtor vazio
	public UserDetailsImpl() {
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	// Método para resgatar a senha do usuario pela Token
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
	// Método para resgatar o user do usuario pela Token
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	
	// MÉTODOS BOOLEANOS INFORMANDO SE HOUVE EXPIRAÇÃO DE DADOS OU NÃO
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
