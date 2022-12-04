package br.com.padrao.projeto.strategy.service;

import br.com.padrao.projeto.strategy.service.Interface.Frete;
import br.com.padrao.projeto.strategy.service.Interface.frete.Pac;
import br.com.padrao.projeto.strategy.service.Interface.frete.Sedex;
import br.com.padrao.projeto.strategy.service.Interface.frete.Transportadora;

public enum TipoFrete {

    PAC {
        @Override
        public Frete calcularValorFrete() {
            return new Pac();
        }
    },

    SEDEX {
        @Override
        public Frete calcularValorFrete() {
            return new Sedex();
        }
    },
    
    TRANSPORTADORA {
        @Override
        public Frete calcularValorFrete() {
            return new Transportadora();
        }
    }
    ;

    public abstract Frete calcularValorFrete();

}