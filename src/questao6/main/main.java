package questao6.main;

import questao6.numeroINT.Numero;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        Numero num = new Numero(numero);

        int antecessor = num.getAntecessor();
        int sucessor = num.getSucessor();

        System.out.println("O antecessor é: " + antecessor);
        System.out.println("O sucessor é: " +sucessor);
    }
}
