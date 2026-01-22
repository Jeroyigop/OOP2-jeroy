package OOP2026.Activity1.week3;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0590353427", "1997");
         Book book2 = new Book("The Da Vinci Code", "Dan Brown", "978-0307474275", "2003");
         Book book3 = new Book("Dr. STONE, Vol. 26: A Future to Get Excited About", "Riichiro Inagaki / Boichi", "9781974738670", "2023");
         Book book4 = new Book("1984", "George Orwell", "9780451524935", "1949");

         book1.BookInfo();
         System.out.println();
         book2.BookInfo();
         System.out.println();
         book3.BookInfo();
         System.out.println();
         book4.BookInfo();

    }
 
    

    

    
}







