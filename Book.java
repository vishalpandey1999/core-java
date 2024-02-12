package Chat_gpt_OOPS_Question;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void bookDetails(){
        System.out.print("Title: "+ title);
        System.out.print("Author: "+ author);
    }
}
class Test_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();

        Book book = new Book(title, author);
        book.bookDetails();
    }
}
