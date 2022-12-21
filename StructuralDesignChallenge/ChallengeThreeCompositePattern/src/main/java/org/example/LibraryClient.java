package org.example;

public class LibraryClient {
    public static void main(String[] args) {
        NonFictionBook nonfictionBook = new NonFictionBook("A Brief History of Time");
        FictionBook fictionBookOne = new FictionBook("Hamlet", true);
        FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

        BookCollection bookCollection = new BookCollection();
//        bookCollection.addNonFictionBook(nonfictionBook);
//        bookCollection.addFictionBook(fictionBookOne);
//        bookCollection.addFictionBook(fictionBookTwo);
        bookCollection.addBook(nonfictionBook);
        bookCollection.addBook(fictionBookOne);
        bookCollection.addBook(fictionBookTwo);

//        checkoutNonfictionBook(nonfictionBook);
//        checkoutFictionBook(fictionBookOne);
//        checkoutBookCollection(bookCollection);
        checkoutBook(nonfictionBook);
        checkoutBook(fictionBookOne);
        checkoutBook(bookCollection);

//        returnNonfictionBook(nonfictionBook);
//        returnFictionBook(fictionBookOne);
//        returnBookCollection(bookCollection);
        returnBook(nonfictionBook);
        returnBook(fictionBookOne);
        returnBook(bookCollection);
    }

    public static void checkoutBook(Book book){
       book.checkout();
    }
    public static void returnBook(Book book){
        book.returnBook();
    }
//    public static void returnBookCollection(BookCollection bookCollection) {
//        bookCollection.returnBook();
//    }
//
//    public static void returnFictionBook(FictionBook fictionBookOne) {
//        fictionBookOne.returnBook();
//    }
//
//    public static void returnNonfictionBook(NonFictionBook nonfictionBook) {
//        nonfictionBook.returnBook();
//    }
//
//    public static void checkoutBookCollection(BookCollection bookCollection) {
//        bookCollection.checkout();
//    }
//
//    public static void checkoutFictionBook(FictionBook fictionBookOne) {
//        fictionBookOne.checkout();
//    }
//
//    public static void checkoutNonfictionBook(NonFictionBook nonfictionBook) {
//        nonfictionBook.checkout();
//    }
}
