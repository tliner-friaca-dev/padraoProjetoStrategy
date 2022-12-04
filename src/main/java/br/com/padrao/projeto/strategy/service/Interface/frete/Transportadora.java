package br.com.padrao.projeto.strategy.service.Interface.frete;

import br.com.padrao.projeto.strategy.service.Interface.Frete;

public class Transportadora implements Frete {

    public static Double TAXA_PARA_CALCULO = 4D;

    @Override
    public double calcularValorFrete(double distancia) {
        return distancia * TAXA_PARA_CALCULO;
    }

}
