package app;

public class Product {
	    public String Name;
	    public double Quantity;
	    public double Price;

	    public void addProduct(int stock){
	        this.Quantity += stock;
	    }

	    public void subProduct(int stock){
	        this.Quantity -= stock;
	    }
}
