package app;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        Product product = new Product();

        product.Name = JOptionPane.showInputDialog("Informe o produto que será cadastrado: ");

        product.Quantity = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));

        product.Price = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço individual: "));

        JOptionPane.showMessageDialog(null, "Confirmação: " + product.Name + ", Estoque atual: " + product.Quantity + ", Preço: " + product.Price);

        int stock = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir mais produtos? Digite a quantidade: "));

        product.addProduct(stock);

        JOptionPane.showMessageDialog(null, "Atualização: " + product.Name + ", Estoque atual: " + product.Quantity + ", Preço: " + product.Price);

        stock = Integer.parseInt(JOptionPane.showInputDialog("Atualmente alguma venda foi realizada? Digite a quantidade: "));

        product.subProduct(stock);

        JOptionPane.showMessageDialog(null, "Atualização pós venda: " + product.Name + ", Estoque atual: " + product.Quantity + ", Preço: " + product.Price + ", Valor atual do estoque: " + product.Price * product.Quantity);
    }
}

