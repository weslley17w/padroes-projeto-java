package br.padroesdeprojeto.singleton;

/**
 * Singleton Eger
 * @author Weslley Barros
 */

public class SingleEager {
    private static SingleEager instancia = new SingleEager();

    private SingleEager() { }

    public static SingleEager getInstancia(){
        return instancia;
    }
}
