package br.com.franca.microserviceproduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceProdutoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroServiceProdutoApplication.class, args);
		System.out.println("Inciada com sucesso!");
	}
}
