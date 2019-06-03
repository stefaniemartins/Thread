package poo;

import java.util.Random;

public class Fluxo2 implements Runnable {
    private Random random = new Random();
    private Contador contador;


    public Fluxo2(Contador contador) {
        this.contador = contador;
    }

//    public void run(){
//        for (int i = 0; i < 10; i++){
//            System.err.println("Fazendo uso de interface");
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
            System.err.println(i + " fluxo2: contador: " + this.contador.getValor());
            this.contador.incrementa();
            System.err.println(i + " fluxo2: contador: " + this.contador.getValor());

            try {
                Thread.sleep(random.nextInt(2000) + 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
