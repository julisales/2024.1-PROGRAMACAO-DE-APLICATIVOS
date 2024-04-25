package app;

public class Cliente {
    public String nome;
    public String endereco;
    public boolean ativo;

    public void desativarCliente() {
        this.ativo = false;
    }
}
