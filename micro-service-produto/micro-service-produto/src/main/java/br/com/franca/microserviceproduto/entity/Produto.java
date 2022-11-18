package br.com.franca.microserviceproduto.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "descricao")
    private String descricao;

}
