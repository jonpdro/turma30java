package org.generation.blogPessoal.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity // -> Permissão para habilitar o Security
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter /* Herdando o a classe do Security */ {

	@Autowired // -> Injeção de indepedencia de um repository
	private UserDetailsService userDetailsService;

	@Override // -> Sobrescrita de método
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/usuarios/login").permitAll().antMatchers("/usuarios/cadastrar")
				.permitAll().anyRequest().authenticated().and().httpBasic().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().cors().and().csrf().disable();
	}

	/*
	 * Classe de configuração para definir algumas configurações de segurança.
	 * 
	 * O código .antMatchers(HttpMethod.GET, "/produtos").permitAll() esta
	 * restringindo o end point produtos, apenas para os método Get, para os demais
	 * métodos neste end point só será possível, por meio de uma autencação.
	 */
}
