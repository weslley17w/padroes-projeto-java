package br.padroesdeprojeto.singleton;

/**
 * Singleton Lazy
 * @author Weslley Barros
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() { }

    public static SingletonLazy getInstancia(){
        if(instancia == null) instancia = new SingletonLazy();
        return instancia;
    }
}
