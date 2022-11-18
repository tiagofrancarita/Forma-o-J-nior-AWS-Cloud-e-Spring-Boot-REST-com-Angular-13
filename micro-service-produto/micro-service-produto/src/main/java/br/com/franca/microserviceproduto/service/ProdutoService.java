package br.com.franca.microserviceproduto.service;

import br.com.franca.microserviceproduto.entity.Produto;

import java.util.List;

public interface ProdutoService {

    List<Produto> listarTodos();

    Produto salvar(Produto produto);

    void deletarProduto(Long id);
}
