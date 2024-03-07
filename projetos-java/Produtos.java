public class Produtos {
    public static void main(String[] args) {
        String[] produto = {"Processador Cyrix", "Processador Intel Core", "Processador AMD"};

        float emin, emax, vmd, tr, lr, mes1, mes2, mes3, ea;
        String td;

        System.out.println(produto[0]);

        mes1 = 500;
        mes2 = 600;
        mes3 = 1000;
        tr = 7;
        lr = 60;
        ea = 100;

        vmd = ((mes1 + mes2 + mes3)/3)/25;
        emin = tr * vmd;
        emax = lr + emin;

        if (ea > emin) {
            td = "Não Comprar!";
        } else {
            td = "Comprar!";
        }

        System.out.println("A venda média diária é: " + vmd);
        System.out.println("O estoque minímo é: " + emin);
        System.out.println("O estoque máximo é: " + emax);
        System.out.println("Tomada de decisão: " + td);
        System.out.println();


        System.out.println(produto[1]);

        mes1 = 100;
        mes2 = 100;
        mes3 = 100;
        tr = 5;
        lr = 50;
        ea = 70;

        vmd = ((mes1 + mes2 + mes3)/3)/25;
        emin = tr * vmd;
        emax = lr + emin;

        if (ea > emin) {
            td = "Não Comprar!";
        } else {
            td = "Comprar!";
        }

        System.out.println("A venda média diária é: " + vmd);
        System.out.println("O estoque minímo é: " + emin);
        System.out.println("O estoque máximo é: " + emax);
        System.out.println("Tomada de decisão: " + td);
        System.out.println();


        System.out.println(produto[2]);

        mes1 = 250;
        mes2 = 350;
        mes3 = 450;
        tr = 9;
        lr = 100;
        ea = 80;

        vmd = ((mes1 + mes2 + mes3)/3)/25;
        emin = tr * vmd;
        emax = lr + emin;

        if (ea > emin) {
            td = "Não Comprar!";
        } else {
            td = "Comprar!";
        }

        System.out.println("A venda média diária é: " + vmd);
        System.out.println("O estoque minímo é: " + emin);
        System.out.println("O estoque máximo é: " + emax);
        System.out.println("Tomada de decisão: " + td);
        System.out.println();
    }
}
