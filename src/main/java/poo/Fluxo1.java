package poo;

import java.util.Random;

public class Fluxo1 extends Thread{
    private Random random = new Random();
    private Contador contador;

    public Fluxo1(Contador contador) {
        this.contador = contador;
    }

//    public void run(){
//        for (int i = 0; i < 10; i++){
//            System.err.println("Fazendo uso de herança");
//
//            try {
//                Thread.sleep(random.nextInt(2000) + 1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }

    public void run(){
        for (int i = 0; i < 10; i++){
            System.err.println(i + " fluxo1: contador: " + this.contador.getValor());
            this.contador.incrementa();
            System.err.println(i + " fluxo1: contador: " + this.contador.getValor());

            try {
                Thread.sleep(random.nextInt(2000) + 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
