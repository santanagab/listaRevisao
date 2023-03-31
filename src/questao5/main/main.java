package questao5.main;

import questao5.salario.salario;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Informe o valor do salário do usuário: R$ ");
        double salarioUsuario = scanner.nextDouble();

        salario salario = new salario(salarioMinimo, salarioUsuario);
        double qtdSalarioMin = salario.calcularQTDSalarioMin();

        System.out.println("Quantidade de salários do usuário: " + qtdSalarioMin);

        scanner.close();
    }

}
