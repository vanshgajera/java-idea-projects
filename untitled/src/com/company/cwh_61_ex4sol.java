package com.company;

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0; // stat to number int 1
    }

    public void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(no_of_books);
        System.out.println(book + " has been added!");
    }

    public void showAvailableBooks(){
        System.out.println("Available Book are:");
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* " + book);

        }
    }

    public void issueBook(String book){
        for(int i=0; i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                // System.out.println(books[i]); // show to name in books
                this.books[i] = null; // this is remove to book name
                return;
            }
        }
        System.out.println("This book does not exist");

    }

    public void returnBook(String book){
        addBook(book);
    }

}

public class cwh_61_ex4sol {
    public static void main(String[] args) {
        // You have to implement a library using java Class Library
        // Method: AddBooks, issueBooks, returnBook, showAvailableBooks
        // Properties: Array to store the available books, Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Algorithms");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Algorithms");
        centralLibrary.showAvailableBooks();

    }
}
