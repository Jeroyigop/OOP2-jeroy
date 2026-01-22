package OOP2026.Activity1.week3;

public class Book {

    String title;
    String author;
    String isbn;
    String publication;

    public Book(String Booktitle, String Bookauthor, String Bookisbn, String Bookpublication) {
        title = Booktitle;
        author = Bookauthor;
        isbn = Bookisbn;
        publication = Bookpublication;
    }
    public void BookInfo() {
        System.out.printf("Title: %s\nAuthor: %s\nISBN: %s\nPublication: %s\n", title, author, isbn, publication);
        

    }

}






