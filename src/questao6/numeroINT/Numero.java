package questao6.numeroINT;

public class Numero {
    int numero;

    public Numero(int numero){
        this.numero = numero;
    }

    public int getAntecessor(){
        return numero -1;
    }

    public int getSucessor(){
        return numero +1;
    }
}
