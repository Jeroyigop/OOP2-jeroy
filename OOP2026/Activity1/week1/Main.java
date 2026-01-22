package OOP2026.Activity1.week1;

import OOP2026.Activity1.week1.week2.Laptop;

public class Main {
    public static void main(String[] args) {
      Laptop laptop1 = new Laptop();

      laptop1.brand = "Asus";
      laptop1.model = "TUF Gaming 16";
      laptop1.condition = "New";
      laptop1.dimension = 15.6;
      laptop1.storage = 12;
      laptop1.memory = 12;
      laptop1.price = 42000;

      var laptop2 = new Laptop();
 
      laptop2.brand = "Dell"; 
      laptop2.model = "Latitude 7390";
      laptop2.condition = "Old";
      laptop2.dimension = 16.3;
      laptop2.storage = 256;
      laptop2.memory = 8;
      laptop2.price = 35000;


    }
}