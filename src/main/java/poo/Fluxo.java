package poo;

public class Fluxo {
    private String id;

    public Fluxo(String id){
        this.id = id;
    }

    public  void disparar(){
        for (int i = 0; i < 10; i++){
            System.out.println(id + ": " + i);
        }
    }
}
