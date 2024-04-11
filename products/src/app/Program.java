package app;

import java.util.Scanner;

public class Program {
    	
	public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Informe o produto que será cadastrado: ");
        product.Name = scan.next();

        System.out.print("Informe a quantidade: ");
        product.Quantity = scan.nextDouble();

        System.out.print("Informe o preço individual: ");
        product.Price = scan.nextDouble();
        System.out.println("");

        //System.out.println("Confirmação: " + product.Name + ", Estoque atual: " + product.Quantity + ", Preço: R$" + product.Price);
        System.out.println("Produto cadastrado!");
        System.out.println("Produto: " + product.Name);
        System.out.println("Estoque atual: " + product.Quantity);
        System.out.println("Preço: R$" + product.Price);
        System.out.println("");

        System.out.print("Deseja inserir mais produtos? ");
        int stock = scan.nextInt();
        System.out.println("");

        product.addProduct(stock);

        //System.out.println("Atualização: " + product.Name + ", Estoque atual: " + product.Quantity + ", Preço: R$" + product.Price);
        System.out.println("Atualização!");
        System.out.println("Produto: " + product.Name);
        System.out.println("Estoque atual: " + product.Quantity);
        System.out.println("Preço: R$" + product.Price);
        System.out.println("");

        System.out.print("Atualmente alguma venda foi realizada? ");
        stock = scan.nextInt();
        System.out.println("");

        product.subProduct(stock);

        //System.out.println("Atualização: " + product.Name + ", Estoque atual: " + product.Quantity + ", Preço: R$" + product.Price);
        System.out.println("Atualização!");
        System.out.println("Produto: " + product.Name);
        System.out.println("Estoque atual: " + product.Quantity);
        System.out.println("Preço: R$" + product.Price);

        scan.close();
    }
}

