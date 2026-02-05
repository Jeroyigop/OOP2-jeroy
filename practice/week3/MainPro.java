package OOP2026.Activity1.week3;

public class MainPro {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.name = "Co-pal Grocery Store";

        Product p1 = new Product("Fresh Milk", 100, 1);
        Product.totalProducts++;
        Product p2 = new Product("Coffee", 300, 5);
        Product.totalProducts++;
        Product p3 = new Product("Condensed Milk", 70, 20);
        Product.totalProducts++;

        shop.productList = new Product[50];
        shop.productList[0] = p1;
        shop.productCount++;
        shop.productList[1] = p2;
        shop.productCount++;
        shop.productList[2] = p3;
        shop.productCount++;
        shop.addProduct(new Product("Water", 20, 100));
        

        System.out.println("Welcome to " + shop.name );
        shop.displayProducts();


    }
}