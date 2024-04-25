package app;

public class Produto {
    public String nome;
    public double quantidade;
    public double preco;

    public void addProduto(int estoque){
        this.quantidade += estoque;
    }

    public void subProduto(int estoque){
        this.quantidade -= estoque;
    }
}
