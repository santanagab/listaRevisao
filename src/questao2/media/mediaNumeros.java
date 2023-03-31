package questao2.media;

import questao2.calculadora.calculadora;

public class mediaNumeros {
    public static void main(String[] args) {
        int[] lista1 = {8,9,7};
        int[] lista2 = {4,5,6};

        int media1 = calculadora.calcularMedia(lista1);
        int media2 = calculadora.calcularMedia(lista2);

        double somarMedias = media1 + media2;
        double mediaDasMedias = somarMedias / 2;

        System.out.println("A média dos números 8, 9 e 7 é: " +media1);
        System.out.println("A média dos números 4, 5 e 6 é: " +media2);
        System.out.println("A soma das médias é:" +somarMedias);
        System.out.println("A média das duas médias é: " +mediaDasMedias);
    }
}
