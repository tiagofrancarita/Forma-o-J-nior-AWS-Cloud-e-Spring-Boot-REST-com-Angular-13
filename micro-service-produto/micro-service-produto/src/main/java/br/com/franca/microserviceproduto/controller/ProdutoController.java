package br.com.franca.microserviceproduto.controller;

import br.com.franca.microserviceproduto.entity.Produto;
import br.com.franca.microserviceproduto.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/produto")
public class ProdutoController {

    public final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> buscarTodos(){

        return ResponseEntity.ok(produtoService.listarTodos());

    }

    @PostMapping
    public  ResponseEntity<Produto> salvar(@RequestBody Produto produto){

         var novoProduto = produtoService.salvar(produto);


        return new ResponseEntity(novoProduto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){

        produtoService.deletarProduto(id);

        return  ResponseEntity.ok().build();
    }
}