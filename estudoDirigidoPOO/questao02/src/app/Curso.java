package app;

public class Curso {
    public String nome;
    public int cargaHoraria;
    public double valor;

    public double calcularCustoPorHora() {
        if (cargaHoraria == 0) {
            return 0;
        }
        return valor / cargaHoraria;
    }
}
