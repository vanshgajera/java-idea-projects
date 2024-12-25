package com.company;

class Library1{
    // Properties to store the available books and issued books
    private String[] availableBooks;
    private String[] issuedBooks;
    private int availableCount;
    private int issuedCount;

    // Constructor to initialize the arrays with a given capacity
    public Library1(int capacity){
        availableBooks = new String[capacity];
        issuedBooks = new String[capacity];
        availableCount = 0;
        issuedCount = 0;
    }

    // Method to add books to the library
    public void addBook(String bookName){
        if(availableCount < availableBooks.length){
            availableBooks[availableCount] = bookName;
            availableCount++;
            System.out.println(bookName + " has been added to the library.");
            // System.out.println(availableCount);
        }
        else{
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Method to issue books from the library
    public void issuedBooks(String bookname){
        boolean found = false;
        for(int i=0; i < availableCount; i++){
            if(availableBooks[i].equals(bookname)){
                issuedBooks[issuedCount] = bookname;
                issuedCount++;
                availableBooks[i] = availableBooks[availableCount - 1];
                availableBooks[availableCount - 1] = null;
                availableCount --;
                found = true;
                System.out.println(bookname + " has been issued");
                break;

            }
        }
        if(!found){
            System.out.println(bookname + " is not available in library.");
        }
    }

    // Method to return books to the library
    public void returnBook(String bookName) {
        boolean found = false;
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i].equals(bookName)) {
                availableBooks[availableCount] = bookName;
                availableCount++;
                issuedBooks[i] = issuedBooks[issuedCount - 1];
                issuedBooks[issuedCount - 1] = null;
                issuedCount--;
                found = true;
                System.out.println(bookName + " has been returned.");
                break;
            }
        }
        if (!found) {
            System.out.println(bookName + " was not issued from this library.");
        }
    }

    // Method to show all available books in the library
    public void showAvailableBooks() {
        if (availableCount == 0) {
            System.out.println("No books are available in the library.");
        } else {
            System.out.println("Available books in the library:");
            for (int i = 0; i < availableCount; i++) {
                System.out.println((i + 1) + ". " + availableBooks[i]); // (i+1) 1 number to digit to start to now.
            }
        }
    }

}




public class cwh_51_exercise4 {
    public static void main(String[] args) {
        // You have to implement a library using java Class Library
        // Method: AddBooks, issueBooks, returnBook, showAvailableBooks
        // Properties: Array to store the available books, Array to store the issued books

        Library1 lib = new Library1(10);


        lib.addBook("Java");
        lib.addBook("DSA");
        lib.addBook("OOPS");
        lib.addBook("BHAGWAT GEETA");
        lib.addBook("MAHABHARAT");
        lib.addBook("RAMAYANA");
        lib.addBook("VALMIKI");
        lib.addBook("SANKRACHARYA");
        lib.addBook("Vivekanand");
        lib.addBook("Mohandas");
      //  lib.addBook("MAHADEV");

        lib.showAvailableBooks();


        lib.issuedBooks("DSA");
        lib.showAvailableBooks();

        lib.returnBook("DSA");
        lib.showAvailableBooks();


    }
}
