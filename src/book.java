/* 
his class defines:
Book title, author, and quantity
Constructor to create a book
Methods to get book details and update quantity
*/

/*
Public class book:
 * We use private so that these values can't be 
 * changed directly from outside the class. Instead, 
 * we create methods (getters/setters) to manage them.
 */


 /*
Constructor:
 *The constructor runs when we create a new Book.
 *this.title = title; → Assigns the passed parameter 
 *title to the class attribute title.
 */



public class book {
    private String title;
    private String author;
    private int quantity;


    //Constructor
    public book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }


    //Getters //! These getter methods allow us to access the book’s details safely.
    public String getTitle() {
        return title;

    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
 
    }

    //Update quantity //!Updates the number of available copies of a book.
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    //Display book details //!This method prints book details in a formatted way.
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Quantity: " + quantity);
    }









}
