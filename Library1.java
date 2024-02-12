package Core_Java;

import java.util.ArrayList;

class Book1{
    private String title;
    private String author;
    public Book1(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
class Library_{
    private ArrayList<Book1> books;
    public Library_(){
        this.books = new ArrayList<Book1>();
    }

    public void add_book(Book1 book1){
        books.add(book1);
    }

    public void remove_book(Book1 book1){
        books.remove(book1);
    }
    public ArrayList<Book1> getBooks(){
        return books;
    }
}

public class Library1 {
    public static void main(String[] args) {
        Library_ library = new Library_();
        Book1 b1 = new Book1("C Programming","Vishal Bhai");
        Book1 b2 = new Book1("Java Programming Language","Raj Bhaiya" );
        Book1 b3 = new Book1("Python", "Shivam Tiwari");
        library.add_book(b1);
        library.add_book(b2);
        library.add_book(b3);

    }
}
