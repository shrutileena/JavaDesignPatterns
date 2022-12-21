package org.example;

import java.util.ArrayList;

public class BookCollection implements Book {

//    ArrayList<FictionBook> fictionBooks = new ArrayList<>();
//    ArrayList<NonFictionBook> nonFictionBooks = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void checkout(){
        books.forEach(Book::checkout);
    }
    public void returnBook(){
        books.forEach(Book::returnBook);
    }
//    public void addFictionBook(FictionBook fictionBook){
//        fictionBooks.add(fictionBook);
//    }
//    public void addNonFictionBook(NonFictionBook nonFictionBook){
//        nonFictionBooks.add(nonFictionBook);
//    }
//    public void checkout(){
//        nonFictionBooks.forEach(NonFictionBook::checkout);
//        fictionBooks.forEach(FictionBook::checkout);
//    }
//    public void returnBook(){
//        nonFictionBooks.forEach(NonFictionBook::returnBook);
//        fictionBooks.forEach(FictionBook::returnBook);
//    }
}
