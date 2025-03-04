import java.util.Scanner;

public class LibMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        // Sample books
        library.addBook(new book("Java Programming", "James Gosling", 5));
        library.addBook(new book("Clean Code", "Robert C. Martin", 3));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Show all books");
            System.out.println("2. Register a student");
            System.out.println("3. Show all students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student program: ");
                    String program = scanner.nextLine();

                    student newStudent = new student(id, name, program);
                    library.registerStudent(newStudent);
                    break;
                case 3:
                    library.showAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
