package br.padroesdeprojeto.singleton;

/**
 * Singleton Holder
 * @author Weslley Barros
 */

public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() { }

    public static SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    }
}
