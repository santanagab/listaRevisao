package questao4.calculadora;

import questao4.calcularIPI.calcularIPI;

public class calculadora {
    public static void main(String[] args) {
      calcularIPI calculadora = new calcularIPI(10, "Pç1", 100.5, 2,
              "Pç2", 75.25, 3) ;

      double total = calculadora.calcularValor();

        System.out.println("Valor total: R$" +total);
    }
}
