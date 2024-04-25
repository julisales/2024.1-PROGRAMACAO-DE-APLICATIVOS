package app;

public class Funcionario {

    public int id;
    public String login;
    public int senha;

    public boolean verificaCadastro(int id, String login, int senha) {
        return this.id == id && this.login.equals(login) && this.senha == senha;
    }
}
