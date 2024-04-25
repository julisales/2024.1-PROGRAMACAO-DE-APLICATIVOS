package app;

public class Aluno {
    public String nome;
    public int ano;
    public double[] notas = new double[3];

    public double calculaMedia(double[] notas){
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public int calculaIdade(int ano){

        int idade = 2024 - ano;

        return idade;
    }
}
