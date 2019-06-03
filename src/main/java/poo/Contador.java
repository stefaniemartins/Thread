package poo;

public class Contador {
    private int valor;

    public Contador(){
        this.valor = 0;
    }

    public void incrementa(){
        int i = this.valor;

        i = i + 1;

        this.valor = i;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
}
