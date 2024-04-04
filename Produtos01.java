import java.util.Scanner;
public class Produtos01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scan.nextLine();

        double somaMeses = 0;

        for(int i = 0; i < 7; i++){
            System.out.printf("Digite o total de vendas do %dº mês: ", i + 1);
            double meses = scan.nextDouble();

            somaMeses += meses;
        }

        double vmd = (somaMeses / 7) / 25;

        System.out.print("Digite o tempo de reposição: ");
        int tr = scan.nextInt();

        double emin = tr * vmd;

        System.out.print("Digite o lote de reposição: ");
        int lr = scan.nextInt();

        double emax = lr + emin;

        System.out.print("Digite o estoque atual: ");
        int ea = scan.nextInt();

        String tmd = (ea > emin) ? "Não comprar" : "Comprar";

        System.out.printf("Venda média diária: %.0f\n", vmd);
        System.out.printf("Estoque mínimo: %.0f\n", emin);
        System.out.printf("Estoque máximo: %.0f\n", emax);
        System.out.printf("Tomada de decisão: %s\n", tmd);
    }
}