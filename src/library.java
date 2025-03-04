/*
 * We use an ArrayList<Book> to store multiple books.
 *  ArrayList is like a flexible array 
 * that can grow/shrink dynamically.
 */

 /*
    addBook(Book book) Method
  * This method adds a book to the ArrayList.
  * books.add(book); → Adds the book object to the list.
  * System.out.println(...) → Prints a confirmation message.
  */


import java.util.ArrayList;

public class library {
    private ArrayList<book> books; //List to store books


    //Constructor //!When we create a Library object, we initialize the books list to store books.
    public library() {
        this.books = new ArrayList<>();
    }


    //Add a new book
    public void addBook(book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }


    //Display all books
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in Library.");
            return;
        }
        System.out.println("\nList of books in the library:");
        for (book book : books) {
            book.displayBook();
        }
    }


    //Search for a book by title
    public book searchBook(String title) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Book found
            }
        }
        return null; // Book not found
    }
    
}
