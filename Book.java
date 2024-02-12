package Java_OOPS_For_Inter;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void borrow(){
        if(isAvailable){
            isAvailable = false;
        } else{
            System.out.println("Book is already borrowed");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
        }else {
            System.out.println("Book is already available in the library.");
        }
    }

    public String toString(){
        return "Title: "+ title+", Author: "+ author+", Available: "+isAvailable;
    }
}

class Patron{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Library{
    private List<Book> books;

    public Library(){
       this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void borrowBook(Patron patron, Book book){
        if(book.isAvailable()){
            book.borrow();
            System.out.println(patron.getName()+" borrowed the book: "+book.getTitle());
        }else{
            System.out.println("Sorry, the book "+book.getTitle()+" is not available for borrowing");
        }
    }

    public void returnBook(Patron patron, Book book) {
        if (!book.isAvailable()) {
            book.returnBook();
            System.out.println(patron.getName() + " returned the book: " + book.getTitle());
        } else {
            System.out.println("The book "+book.getTitle()+" is already available in the library");
        }
    }

    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
