/*
 *	Classe de arranque da aplicação.
 *
 *	IFNMG - Sistemas de Informação
 *	Eduardo Pereira de Almeida
 *	02/08/2021
 *
 *	version: 1.0.0.1
 */

package com.algaworks.contato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContatoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatoApiApplication.class, args);
	}
}
