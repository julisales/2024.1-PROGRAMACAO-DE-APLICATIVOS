package app;

public class Fornecedor {
    public String nome;
    public int quantidadeProdutos;
    public String categoria;

    public void avisoPoucoEstoque() {
        if (this.quantidadeProdutos < 10) {
            System.out.println("\nAtenção: Poucos produtos em estoque!");
        }
    }
}
