package OOP2026Activity1.week3;

public class Product {
    String name;
    double price;
    int stock;
    static int totalProducts = 0;

    public Product(){}
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getInfo(){
        return name + " - " + price;
    }
}