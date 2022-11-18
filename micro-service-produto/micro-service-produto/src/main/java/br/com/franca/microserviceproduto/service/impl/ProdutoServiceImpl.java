package br.com.franca.microserviceproduto.service.impl;

import br.com.franca.microserviceproduto.entity.Produto;
import br.com.franca.microserviceproduto.repository.ProdutoRepository;
import br.com.franca.microserviceproduto.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @Override
    public List<Produto> listarTodos() {


        return produtoRepository.findAll();
    }

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void deletarProduto(Long id) {

        try {

            produtoRepository.deleteById(id);

        }catch (Exception e){

            throw new RuntimeException("Ocorreu um erro ao tentar excluir o produto."
                                        + e.getClass() + e.getMessage() + e.getStackTrace());
        }


    }
}
