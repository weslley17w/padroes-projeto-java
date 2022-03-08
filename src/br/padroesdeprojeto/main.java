package br.padroesdeprojeto;
import br.padroesdeprojeto.facade.Facade;
import br.padroesdeprojeto.singleton.*;
import br.padroesdeprojeto.strategy.*;


public class main {
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

        //Strategy

        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento normal = new ComportamentoNormal();
        IComportamento agressivo = new ComportamentoAgressivo();

        System.out.println("\nStrategy");
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        System.out.println("\nFacade");
        Facade facade = new Facade();
        facade.migrarCliente("Weslley", "73800-123");
    }
}
