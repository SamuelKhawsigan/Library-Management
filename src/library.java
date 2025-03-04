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
import java.util.List;

public class library {
    private List<book> books; //List to store books
    private List<student> students; //Stores registered students

    public library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

      // Add a book to the library
      public void addBook(book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    //Update the Quantity of the books
    public void updateBookQuantity(String title, int quantity) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.updateQuantity(quantity);
                System.out.println("Updated quantity for book: " + title);
                return;
            }
            
        }
        System.out.println("Book not found: " + title);
    }


     // Search for a book by title
     public void searchBook(String title) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // Show all books in the library
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("\nNo books available in the library.");
        } else {
            System.out.println("\nList of books in the library:");
            for (book book : books) {
                System.out.println(book);
            }
        }
    }

    // Register a new student
    public void registerStudent(student student) {
        students.add(student);
        System.out.println("Student registered successfully: " + student.getName());
    }

    // Show all registered students
    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students are registered yet.");
        } else {
            System.out.println("\nList of registered students:");
            for (student student : students) {
                System.out.println(student);
            }
        }
    }
}
