package questao5.salario;

public class salario {
    double salarioMinimo;
    double salarioUsuario;

    public salario(double salarioMinimo, double salarioUsuario){
        this.salarioMinimo = salarioMinimo;
        this.salarioUsuario = salarioUsuario;
    }

    public double calcularQTDSalarioMin(){
        return salarioUsuario/salarioMinimo;
    }
}
