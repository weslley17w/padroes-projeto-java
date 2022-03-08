package br.subsistema2.cep;

import br.padroesdeprojeto.singleton.SingleEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Brasília";
    }

    public String recuperarEstado(String cep) {
        return "DF";
    }
}