package questao1.calcularIdade;

import questao1.dadosPessoa.Pessoa;

public class calcularIdade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(35, 10, 15);
        int idadeEmDias = pessoa.calcularIdadeEmDias();
        System.out.println("Idade da pessoa em dias: " + idadeEmDias);
    }
}
