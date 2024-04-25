package app;
import javax.swing.*;
import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        funcionario.id = 654321;
        funcionario.login = "funcionario";
        funcionario.senha = 123456;

        System.out.println("Bem vindo, funcionário(a)");
        System.out.println("Entre na sua conta: \n");

        System.out.print("Digite o id: ");
        int id = scan.nextInt();

        System.out.print("Digite o login: ");
        String login = scan.next() + scan.nextLine();

        System.out.print("Digite a senha: ");
        int senha = scan.nextInt();

        boolean cadastrado = funcionario.verificaCadastro(id, login, senha);
        if(cadastrado) {
            boolean continuar = true;

            while(continuar) {
                System.out.println("\nCÓDIGO | FUNÇÃO");
                System.out.println("  1    | Cadastrar produto");
                System.out.println("  2    | Cadastrar fornecedor");
                System.out.println("  3    | Cadastrar cliente");
                System.out.println("  0    | Sair");

                System.out.println("\nO que deseja fazer?");
                int codigo = scan.nextInt();

                switch (codigo) {
                    case 1:
                        Produto produto = new Produto();

                        System.out.print("Informe o produto que será cadastrado: ");
                        produto.nome = scan.next();

                        System.out.print("Informe a quantidade: ");
                        produto.quantidade = scan.nextDouble();

                        System.out.print("Informe o preço individual: ");
                        produto.preco = scan.nextDouble();

                        JOptionPane.showMessageDialog(null, String.format("\nConfirmação: %s, Estoque atual: %.2f, Preço: R$%.2f", produto.nome, produto.quantidade, produto.preco));

                        System.out.print("\nDeseja inserir mais produtos? Digite a quantidade: ");
                        int estoque = scan.nextInt();

                        produto.addProduto(estoque);

                        JOptionPane.showMessageDialog(null, String.format("\nAtualização: %s, Estoque atual: %.2f, Preço: R$%.2f", produto.nome, produto.quantidade, produto.preco));

                        System.out.print("Atualmente alguma venda foi realizada? Digite a quantidade:");
                        estoque = scan.nextInt();

                        produto.subProduto(estoque);

                        JOptionPane.showMessageDialog(null, String.format("\nAtualização pós venda: %s, Estoque atual: %.2f, Preço: R$%.2f", produto.nome, produto.quantidade, produto.preco));
                        break;

                    case 2:
                        Fornecedor fornecedor = new Fornecedor();

                        System.out.print("Informe o nome do fornecedor: ");
                        fornecedor.nome = scan.next() + scan.nextLine();

                        System.out.print("Informe a quantidade de produtos fornecidos: ");
                        fornecedor.quantidadeProdutos = scan.nextInt();

                        System.out.print("Informe a categoria do fornecedor: ");
                        fornecedor.categoria = scan.next() + scan.nextLine();

                        JOptionPane.showMessageDialog(null, String.format("\nFornecedor cadastrado com sucesso!\nNome: %s\nQuantidade de produtos fornecidos: %d\nCategoria: %s", fornecedor.nome, fornecedor.quantidadeProdutos, fornecedor.categoria));

                        fornecedor.avisoPoucoEstoque();
                        break;

                    case 3:
                        Cliente cliente = new Cliente();

                        System.out.print("Informe o nome do cliente: ");
                        cliente.nome = scan.next() + scan.nextLine();

                        System.out.print("Informe o endereço do cliente: ");
                        cliente.endereco = scan.next() + scan.nextLine();

                        JOptionPane.showMessageDialog(null, String.format("\nCliente cadastrado com sucesso!\nNome: %s\nEndereço: %s", cliente.nome, cliente.endereco));

                        System.out.print("\nDeseja desativar este cliente? (1 para sim, 0 para não): ");
                        int desativa = scan.nextInt();

                        if (desativa == 1) {
                            cliente.desativarCliente();
                            JOptionPane.showMessageDialog(null,"\nCliente desativado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "\nCliente continua ativo.");
                        }
                        break;

                    case 0:
                        JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
                        int opcao = 0;
                        if (opcao == JOptionPane.YES_OPTION) {
                            continuar = false;
                            JOptionPane.showMessageDialog(null, "Saindo do programa...");
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Código inválido!");
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário inválido!");
        }

        scan.close();
    }
}