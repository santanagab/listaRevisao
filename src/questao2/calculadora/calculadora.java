package questao2.calculadora;

public class calculadora {
    public static int calcularMedia;

    public static int calcularMedia(int[] numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        return soma / numeros.length;
    }
}
