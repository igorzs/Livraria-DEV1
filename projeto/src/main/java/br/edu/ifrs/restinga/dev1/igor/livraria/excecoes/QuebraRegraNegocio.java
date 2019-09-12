/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.igor.livraria.excecoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author igor
 */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuebraRegraNegocio extends RuntimeException {
    public QuebraRegraNegocio(String erro) {
        super(erro);
    }
}
