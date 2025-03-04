import java.util.Scanner;

public class LibMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        //Adding sample books
        library.addBook(new book("Java Programming", "James Gosling", 5));
        library.addBook(new book("The Art of Computer Programming", "Donald Knuth", 2));
        library.addBook(new book("Clean Code", "Robert C. Martin", 3));


        //Show all books
        library.showAllBooks();


        //Search for a book
        System.out.print("\nEnter book title to search: ");
        String searchTitle = scanner.nextLine();
        book foundBook = library.searchBook(searchTitle);

        if (foundBook != null) {
            System.out.println("Book found:");
            foundBook.displayBook();
        } else {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}

