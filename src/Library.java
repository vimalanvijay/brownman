import java.util.ArrayList;
import java.util.Arrays;

import Book.java;

public class Library{
    private String libAddress;
    private Book book=new Book();
    ArrayList<Book> list = new ArrayList<Book>();



    Library(String add){
        libAddress=add;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open 9am to 5pm everyday ");
    }

    public void printAddress(){
        System.out.println(libAddress);
    }
    
    public void addBook (Book b(String s)){
        // book=b;
        list.add(b);
        
    }

    public void printAvailableBooks(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        // System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // System.out.println("Borrowing The Lord of the Rings:");
        // firstLibrary.borrowBook("The Lord of the Rings");
        // firstLibrary.borrowBook("The Lord of the Rings");
        // secondLibrary.borrowBook("The Lord of the Rings");
        // System.out.println();

        // // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        // System.out.println();
        // System.out.println("Books available in the second library:");
        // secondLibrary.printAvailableBooks();
        // System.out.println();

        // // Return The Lords of the Rings to the first library
        // System.out.println("Returning The Lord of the Rings:");
        // firstLibrary.returnBook("The Lord of the Rings");
        // System.out.println();

        // // Print the titles of available from the first library
        // System.out.println("Books available in the first library:");
        // firstLibrary.printAvailableBooks();
    }
}