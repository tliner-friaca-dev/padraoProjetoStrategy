package br.com.padrao.projeto.strategy;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.padrao.projeto.strategy.service.TipoFrete;
import br.com.padrao.projeto.strategy.service.Interface.Frete;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {

		SpringApplication.run(StrategyApplication.class, args);

		System.out.println("Entrou na aplicação!!!");

		Integer opcaoFrete;
		double distancia = 0d;

		// Inserção das informações - Início
		System.out.println("\n>>> Cálculo de Frete <<< \n");

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite: 1 - Pac - tx.: 2 || 2 - Sedex - tx.: 3 || 3 - Transportadora - tx.: 4");
		opcaoFrete = Integer.valueOf(scanner.next());

		System.out.println("Informe a distância:");
		distancia = Integer.valueOf(scanner.next());

		scanner.close();
		// Inserção das informações - Fim

		// Cálculo do frete - Início
		TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete -1];
		Frete frete = tipoFrete.calcularValorFrete();
		double valorFrete = frete.calcularValorFrete(distancia);
		// Cálculo do frete - Fim

		// Impressão
		System.out.println("\n>>> Informações para o Cálculo <<<");
		System.out.println("Frete escolhido: " + tipoFrete.name());
		System.out.println("Distância: " + distancia);

		System.out.println("\n----------------------");
		System.out.println(" Valor do Frete: " + valorFrete);
		System.out.println("----------------------");

	}

}
