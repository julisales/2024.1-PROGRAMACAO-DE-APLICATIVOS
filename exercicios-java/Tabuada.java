import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, num;

        System.out.print("Digite o número que deseja exibir a tabuada: ");
        num = scan.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, (num*i));
        }
    }
}

