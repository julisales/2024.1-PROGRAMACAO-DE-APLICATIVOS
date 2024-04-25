package app;

import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nCÓDIGO | FUNÇÃO");
            System.out.println("  1    | Cadastrar aluno e notas");
            System.out.println("  2    | Cadastrar professor");
            System.out.println("  3    | Cadastrar curso");
            System.out.println("  4    | Cadastrar funcionario");
            System.out.println("  0    | Sair");

            System.out.println("\nO que deseja fazer: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno();

                    System.out.println("Digite as informações do aluno: ");
                    System.out.print("Nome: ");
                    aluno.nome = scan.next() + scan.nextLine();

                    System.out.print("Digite o ano de nascimento: ");
                    aluno.ano = scan.nextInt();

                    for(int i = 0; i < 3; i++){
                        System.out.printf("Digite a %dª nota: ", i + 1);
                        aluno.notas[i] = scan.nextDouble();
                    }

                    double media = aluno.calculaMedia(aluno.notas);
                    double idade = aluno.calculaIdade(aluno.ano);

                    System.out.println("\nInformações do aluno: ");
                    System.out.println("Nome: " + aluno.nome);
                    System.out.println("Idade: " + idade);
                    for(int i = 0; i < 3; i++){
                        System.out.printf("%dª nota: %f\n", i + 1, aluno.notas[i]);
                    }
                    System.out.println("Média: " + media);
                    break;
                case 2:
                    Professor professor = new Professor();


                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }
    }
}