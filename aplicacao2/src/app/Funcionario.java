package app;

public class Funcionario {
    public String nome;
    public double salario;
    public String cargo;

    public double aumentoSalario(double aumento) {
        double salarioFinal = this.salario + aumento;
        return salarioFinal;
    }
}
