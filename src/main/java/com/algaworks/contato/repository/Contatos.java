/*
 *	Classe responsável em estabelecer o mapeamento objeto-relacional para
 * objetos Java simples e comuns, em si a JPA.
 *
 *	IFNMG - Sistemas de Informação
 *	Eduardo Pereira de Almeida
 *	02/08/2021
 *
 *	version: 1.0.0.1
 */

package com.algaworks.contato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.contato.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
