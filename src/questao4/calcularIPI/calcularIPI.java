package questao4.calcularIPI;

public class calcularIPI {
    double ipi;
    String codigo1, codigo2;
    double valor1, valor2;
    int quantidade1, quantidade2;

    public calcularIPI(double ipi, String codigo1, double valor1, int quantidade1,
                       String codigo2, double valor2, int quantidade2) {
        this.ipi = ipi;
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.quantidade1 = quantidade1;
        this.quantidade2 = quantidade2;
    }

    public double calcularValor(){
        double total = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi/100+1);
        return total;

    }
}
