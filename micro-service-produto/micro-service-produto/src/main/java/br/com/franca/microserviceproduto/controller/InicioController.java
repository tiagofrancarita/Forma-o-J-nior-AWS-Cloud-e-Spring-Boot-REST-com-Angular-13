package br.com.franca.microserviceproduto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()

public class InicioController {

    public static final String  APLICACAO_INICIADA = "Aplicação iniciada com sucesso";

    @GetMapping()
    public String inicio(){

        return APLICACAO_INICIADA;
    }
}
