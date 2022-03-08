package br.padroesdeprojeto;
import br.padroesdeprojeto.singleton.*;


public class Test {
    public static void main(String[] args) {

        System.out.println("Lazy");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("\nEager");
        SingleEager eager = SingleEager.getInstancia();
        System.out.println(eager);
        eager = SingleEager.getInstancia();
        System.out.println(eager);

        System.out.println("\nLazy Holder");
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
}
