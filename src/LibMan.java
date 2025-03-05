import java.util.Scanner;

public class LibMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Update Book Quantity");
            System.out.println("3. Search for a Book");
            System.out.println("4. Show All Books");
            System.out.println("5. Register a Student");
            System.out.println("6. Show All Registered Students");
            System.out.println("7. Check-Out a Book");
            System.out.println("8. Check-In a Book");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.addBook(new book(title, author, quantity));
                    break;

                case 2: // Update Book Quantity
                    System.out.print("Enter book title: ");
                    String updateTitle = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.updateBookQuantity(updateTitle, newQuantity);
                    break;

                case 3: // Search Book
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 4: // Show All Books
                    library.showAllBooks();
                    break;

                case 5: // Register Student
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    library.registerStudent(new student(studentName, studentID, course));
                    break;

                case 6: // Show All Students
                    library.showAllStudents();
                    break;

                case 7: // Check-Out a Book
                    System.out.print("Enter Student ID: ");
                    String checkoutStudentID = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String borrowTitle = scanner.nextLine();
                    library.checkOutBook(checkoutStudentID, borrowTitle);
                    break;

                case 8: // Check-In a Book
                    System.out.print("Enter Student ID: ");
                    String returnStudentID = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String returnTitle = scanner.nextLine();
                    library.checkInBook(returnStudentID, returnTitle);
                    break;

                case 9: // Exit
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please choose a valid number.");
            }
        }
    }
}
