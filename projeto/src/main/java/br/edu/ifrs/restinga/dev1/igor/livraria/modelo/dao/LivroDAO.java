/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.igor.livraria.modelo.dao;

import br.edu.ifrs.restinga.dev1.igor.livraria.modelo.entidade.Livro;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author igor
 */
public interface LivroDAO extends CrudRepository<Livro, Integer> {
    
}
