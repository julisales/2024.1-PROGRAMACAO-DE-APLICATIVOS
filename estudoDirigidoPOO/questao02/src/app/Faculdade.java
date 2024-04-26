package app;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nCÓDIGO | FUNÇÃO");
            System.out.println("  1    | Consultar aluno e calcular média");
            System.out.println("  2    | Atualizar salário professor");
            System.out.println("  3    | Atualizar salário funcionário");
            System.out.println("  4    | Calcular valor carga horária do curso");
            System.out.println("  0    | Sair");

            System.out.println("\nO que deseja fazer? ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno();

                    System.out.println("Digite as informações do aluno: ");
                    System.out.print("Nome: ");
                    aluno.nome = scan.next() + scan.nextLine();

                    System.out.print("Digite o ano de nascimento: ");
                    aluno.ano = scan.nextInt();

                    for (int i = 0; i < 3; i++) {
                        System.out.printf("Digite a %dª nota: ", i + 1);
                        aluno.notas[i] = scan.nextDouble();
                    }

                    double media = aluno.calculaMedia(aluno.notas);
                    double idade = aluno.calculaIdade(aluno.ano);

                    JOptionPane.showMessageDialog(null, String.format(
                            "Informações do aluno:\nNome: %s\nIdade: %.2f\n1ª nota: %.2f\n2ª nota: %.2f\n3ª nota: %.2f\nMédia: %.2f",
                            aluno.nome, idade, aluno.notas[0], aluno.notas[1], aluno.notas[2], media));
                    break;

                case 2:
                    Professor professor = new Professor();

                    System.out.println("Digite o nome do professor: ");
                    professor.nome = scan.next() + scan.nextLine();

                    System.out.println("Digite o salário atual: ");
                    professor.salario = scan.nextDouble();

                    System.out.println("Digite há quanto tempo trabalha(meses): ");
                    professor.mesesTrabalhados = scan.nextInt();

                    double novoSalario = professor.aumentoSalario();

                    JOptionPane.showMessageDialog(null, String.format(
                            "Informações do professor:\nNome: %s\nSalário anterior: %.2f\nSalário atual(com aumento): %.2f",
                            professor.nome, professor.salario, novoSalario));
                    break;

                case 3:
                    Funcionario funcionario = new Funcionario();

                    System.out.println("Digite o nome do funcionário: ");
                    funcionario.nome = scan.next() + scan.nextLine();

                    System.out.println("Digite o cargo: ");
                    funcionario.cargo = scan.next() + scan.nextLine();

                    System.out.println("Digite o salário atual: ");
                    funcionario.salario = scan.nextDouble();

                    System.out.println("Quanto deseja aumentar: ");
                    double aumento = scan.nextDouble();

                    double salarioFinal = funcionario.aumentoSalario(aumento);

                    JOptionPane.showMessageDialog(null, String.format(
                            "Informações do funcionário:\nNome: %s\nCargo: %s\nSalário anterior: %.2f\nSalário atual(com aumento): %.2f",
                            funcionario.nome, funcionario.cargo, funcionario.salario, salarioFinal));
                    break;

                case 4:
                    Curso curso = new Curso();

                    System.out.println("Digite o nome do curso: ");
                    curso.nome = scan.next() + scan.nextLine();

                    System.out.println("Digite a carga horária do curso (em horas): ");
                    curso.cargaHoraria = scan.nextInt();

                    System.out.println("Digite o valor do curso: ");
                    curso.valor = scan.nextDouble();

                    double custoPorHora = curso.calcularCustoPorHora();

                    JOptionPane.showMessageDialog(null, String.format(
                            "O custo por hora do curso é: R$ %.2f", custoPorHora));
                    break;
                case 0:
                    JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (opcao == JOptionPane.YES_OPTION) {
                        continuar = false;
                        JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
        scan.close();
    }
}
