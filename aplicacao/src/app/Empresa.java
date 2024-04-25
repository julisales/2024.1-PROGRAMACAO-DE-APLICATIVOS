package app;
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

                        System.out.println("\nConfirmação: " + produto.nome + ", Estoque atual: " + produto.quantidade + ", Preço: R$" + produto.preco);

                        System.out.print("\nDeseja inserir mais produtos? ");
                        int estoque = scan.nextInt();

                        produto.addProduto(estoque);

                        System.out.println("\nAtualização: " + produto.nome + ", Estoque atual: " + produto.quantidade + ", Preço: R$" + produto.preco);

                        System.out.print("Atualmente alguma venda foi realizada? ");
                        estoque = scan.nextInt();

                        produto.subProduto(estoque);

                        System.out.println("\nAtualização pós venda: " + produto.nome + ", Estoque atual: " + produto.quantidade + ", Preço: R$" + produto.preco);
                        break;

                    case 2:
                        Fornecedor fornecedor = new Fornecedor();

                        System.out.print("Informe o nome do fornecedor: ");
                        fornecedor.nome = scan.next() + scan.nextLine();

                        System.out.print("Informe a quantidade de produtos fornecidos: ");
                        fornecedor.quantidadeProdutos = scan.nextInt();

                        System.out.print("Informe a categoria do fornecedor: ");
                        fornecedor.categoria = scan.next() + scan.nextLine();

                        System.out.println("\nFornecedor cadastrado com sucesso!");
                        System.out.println("Nome: " + fornecedor.nome);
                        System.out.println("Quantidade de produtos fornecidos: " + fornecedor.quantidadeProdutos);
                        System.out.println("Categoria: " + fornecedor.categoria);

                        fornecedor.avisoPoucoEstoque();
                        break;

                    case 3:
                        Cliente cliente = new Cliente();

                        System.out.print("Informe o nome do cliente: ");
                        cliente.nome = scan.next() + scan.nextLine();

                        System.out.print("Informe o endereço do cliente: ");
                        cliente.endereco = scan.next() + scan.nextLine();

                        System.out.println("\nCliente cadastrado com sucesso!");
                        System.out.println("Nome: " + cliente.nome);
                        System.out.println("Endereço: " + cliente.endereco);

                        System.out.print("\nDeseja desativar este cliente? (1 para sim, 0 para não): ");
                        int opcao = scan.nextInt();

                        if (opcao == 1) {
                            cliente.desativarCliente();
                            System.out.println("\nCliente desativado com sucesso!");
                        } else {
                            System.out.println("\nCliente continua ativo.");
                        }
                        break;

                    case 0:
                        System.out.println("Saindo do programa...");
                        break;

                    default:
                        System.out.println("Código inválido!");
                        break;
                }
            }
        } else {
            System.out.println("Funcionário inválido!");
        }

        scan.close();
    }
}