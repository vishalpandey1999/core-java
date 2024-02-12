//package OBJECT_ORIENTED_PROFGRAM;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Book{
//    private String title;
//    private String author;
//    private boolean isAvailable;
//
//    public Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//        this.isAvailable = true;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public boolean isAvailable(){
//        return isAvailable;
//    }
//
//    public void displayInfo(){
//        System.out.println("Title: "+title);
//        System.out.println("Author: "+author);
//    }
//
//}
//class  Patron{
//    private String name;
//    private int patronId;
//    private ArrayList<Book> checkedBook;
//
//    public Patron(String name, int patronId) {
//        this.name = name;
//        this.patronId = patronId;
//        checkedBook = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPatronId() {
//        return patronId;
//    }
//
//    public ArrayList<Book> getCheckedBook() {
//        return checkedBook;
//    }
//
//    public String toString(){
//        return name + "( ID: "+patronId +")";
//    }
//}
//class Library{
//    private ArrayList<Book> books;
//    private ArrayList<Patron> patrons;
//    private ArrayList<String> transaction;
//
//    public Library(){
//        books = new ArrayList<>();
//        patrons = new ArrayList<>();
//        transaction = new ArrayList<>();
//    }
//
//    public ArrayList<Book> getBooks() {
//        return books;
//    }
//
//    public ArrayList<Patron> getPatrons() {
//        return patrons;
//    }
//
//    public ArrayList<String> getTransaction() {
//        return transaction;
//    }
//
//    public void addBook(Book book){
//        books.add(book);
//    }
//
//    public void addPatrons(Patron patron){
//        patrons.add(patron);
//    }
//
//    public boolean borrowBook(Patron patron, Book book) {
//        if (patrons.contains(patron) && books.contains(book)) {
//            if (book.isAvailable()) {
//
//            }
//        }
//
//
//
//
//
////public class Question5 {
////}
