package app;

public class Professor {
    public String nome;
    public double salario;
    public int mesesTrabalhados;

    public double aumentoSalario(){
        double aumento = this.mesesTrabalhados * (this.salario * 0.01);

        double salarioFinal = this.salario + aumento;

        return salarioFinal;
    }

}
