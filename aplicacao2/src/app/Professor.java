package app;

public class Professor {
    public String nome;
    public double salario;
    public int tempoTrabalho;

    public double aumentoSalario(double salario, int tempoTrabalho){
        double aumento = this.tempoTrabalho * 0.10;

        double salarioFinal = this.salario + aumento;

        return salarioFinal;
    }
}
