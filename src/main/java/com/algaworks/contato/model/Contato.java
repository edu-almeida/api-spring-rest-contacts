/*
 *	Essa classe é responsável por ser o modelo dos dados.
 *	Ela representa informações de um contato simples.
 *	Os métodos get, set, comparação e demais são feitos dinamicamente através do lombok.
 *
 *	IFNMG - Sistemas de Informação
 *	Eduardo Pereira de Almeida
 *	02/08/2021
 *
 *	version: 1.0.0.1
 */

package com.algaworks.contato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Contato {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@NotBlank
	private String nome;

	@NotBlank
	private String sobreNome;

	private String numeroCelular;

	@NotNull
	@Email
	private String email;
}
