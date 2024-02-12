package Core_Java;

import java.util.ArrayList;

class Book{
    private String title;
    private String author;
    private static ArrayList <Book> bookCollection = new ArrayList<Book>();
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public static void add_book(Book book){
        bookCollection.add(book);
    }

    public void remove(Book book){
        bookCollection.remove(book);
    }

    public ArrayList <Book> getBookCollection(){
        return bookCollection;
    }
}
public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("C programming language","Raj Mohan Pandey");
        Book b2 = new Book("Java programming language","Vishal Pandey");
        Book b3 = new Book("C++ programming language","Shivam Pandey");
        Book b4 = new Book("JavaScript language","Raj Mohan Pandey");
        Book b5 = new Book("Mathe","Shyam Krishna Pandey");

    }
}
