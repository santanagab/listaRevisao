package questao1.dadosPessoa;

public class Pessoa {
    int anos;
    int meses;
    int dias;

    public Pessoa(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int calcularIdadeEmDias() {
        int idadeEmDias = 0;
        idadeEmDias += anos * 365;
        idadeEmDias += meses * 30;
        idadeEmDias += dias;
        return idadeEmDias;
    }
}
