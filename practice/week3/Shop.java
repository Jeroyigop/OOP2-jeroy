package practice.week3;

public class Shop {
    String name;
    Product[] productList;
    int productCount = 0;

    public Shop() {
    }

    public Shop(String name, Product[] list) {
        this.name = name;
        this.productList = list;
    }

    public void addProduct(Product product) {
        productList[productCount] = product;
        productCount++;

    }

    public void displayProducts() {
        // for(Product p : productList){
        // if(productList[i] != null)
        // System.out.println(p.getInfo());
        // }
        for (int i = 0; i < productCount; i++)
            System.out.println(productList[i].getInfo());
    }

}