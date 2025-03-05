import java.util.ArrayList;

public class library {
    private ArrayList<book> books;
    private ArrayList<student> students;

    public library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // 📌 Add a New Book to the Library
    public void addBook(String title, String author, int quantity) {
        book book = findBookByTitle(title);
        if (book != null) {
            book.updateQuantity(book.getQuantity() + quantity);
            System.out.println("Updated quantity of '" + title + "'.");
        } else {
            books.add(new book(title, author, quantity));
            System.out.println("Book '" + title + "' added to the library.");
        }
    }

    // Overloaded Method to Accept a Book Object
    public void addBook(book newBook) {
        books.add(newBook);
        System.out.println("Book '" + newBook.getTitle() + "' added to the library.");
    }

    // 📌 Update Book Quantity
    public void updateBookQuantity(String updateTitle, int newQuantity) {
        book book = findBookByTitle(updateTitle);
        if (book != null) {
            book.updateQuantity(newQuantity);
            System.out.println("Quantity updated for '" + updateTitle + "'.");
        } else {
            System.out.println("Book not found!");
        }
    }

    // 📌 Show All Books
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n📚 List of Books:");
        for (book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Quantity: " + book.getQuantity());
        }
    }

    // 📌 Search for a Book by Title
    public void searchBook(String title) {
        book book = findBookByTitle(title);
        if (book != null) {
            System.out.println("Book found! Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Quantity: " + book.getQuantity());
        } else {
            System.out.println("Book not found.");
        }
    }

    // 📌 Register a New Student
    public void registerStudent(String name, String studentID, String course) {
        if (findStudentByID(studentID) != null) {
            System.out.println("Student with ID " + studentID + " is already registered.");
            return;
        }
        students.add(new student(name, studentID, course));
        System.out.println("Student " + name + " registered successfully.");
    }

    // Overloaded Method to Accept a Student Object
    public void registerStudent(student newStudent) {
        students.add(newStudent);
        System.out.println("Student " + newStudent.getName() + " registered successfully.");
    }

    // 📌 Show All Registered Students
    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }
        System.out.println("\n🎓 List of Registered Students:");
        for (student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentID() + ", Course: " + student.getCourse());
        }
    }

    // 📌 Check-Out a Book
    public void checkOutBook(String studentID, String bookTitle) {
        student student = findStudentByID(studentID);
        book book = findBookByTitle(bookTitle);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }
        if (book.getQuantity() <= 0) {
            System.out.println("Sorry, no copies available for checkout.");
            return;
        }

        book.updateQuantity(book.getQuantity() - 1);
        System.out.println(student.getName() + " has checked out '" + book.getTitle() + "'.");
    }

    // 📌 Check-In a Book
    public void checkInBook(String studentID, String bookTitle) {
        student student = findStudentByID(studentID);
        book book = findBookByTitle(bookTitle);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        book.updateQuantity(book.getQuantity() + 1);
        System.out.println(student.getName() + " has returned '" + book.getTitle() + "'.");
    }

    // 📌 Helper Methods to Find Student & Book
    private student findStudentByID(String studentID) {
        for (student student : students) {
            if (student.getStudentID().equalsIgnoreCase(studentID)) {
                return student;
            }
        }
        return null;
    }

    private book findBookByTitle(String title) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
