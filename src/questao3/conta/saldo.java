package questao3.conta;

import questao3.calculadora.calculadora;

public class saldo {
    public static void main(String[] args) {
        double saldoAtual = 2500.50;
        double reajuste = 0.01;

        double novoSaldo = calculadora.calcularAumento(saldoAtual, reajuste);

        System.out.println("Saldo anterior: R$ " +saldoAtual);
        System.out.println("Novo saldo com " +(reajuste * 100) + "% de reajuste: R$ " +novoSaldo);
    }
}
