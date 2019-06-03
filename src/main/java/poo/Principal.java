package poo;

import java.util.concurrent.Callable;

public class Principal {
    public static void main(String[] args) {
//        Fluxo f1 = new Fluxo("fluxo1");
//        Fluxo f2 = new Fluxo("fluxo2");
//
//        System.err.println("Iniciando");
//
//        f1.disparar();
//        f2.disparar();
//
//        System.err.println("Finalizando");
//
//        // Executando as Threads
//        Thread comHeranca = new Fluxo1();
//        Thread comInterface = new Thread(new Fluxo2());
//
//        comHeranca.start();
//        comInterface.start();
//
//        System.err.println("Fim do programa");
//
//        Thread f3 = new Fluxo1();
//
//        // Disparando a thread
//        f3.start();
//
//        System.err.println("Depois do start e antes do join");
//
//        try{
//            f3.join();
//
//             // A linha abaixo é executada somente depois de finalizar o método run do objeto f3
//            System.err.println("Depois do join");
//        }catch (InterruptedException ex){
//            System.err.println(ex.toString());
//        }
//
//        System.err.println("Fim do programa");

        Contador contador = new Contador();

        Thread fluxo1 = new Fluxo1(contador);
        Thread fluxo2 = new Thread(new Fluxo2(contador));

        fluxo1.start();
        fluxo2.start();
    }
}
