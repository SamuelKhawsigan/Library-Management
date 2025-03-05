public class student {
    private String name;
    private String studentID;
    private String course;


    //Constructor
    public student(String name, String studentID, String course) {
        this.name = name;
        this.studentID = studentID;
        this.course = course;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getCourse() {
        return course;

    }


    //toString method to display the student details
    @Override
    public String toString() {
         return "Student ID: " + studentID + ", Name: " + name + ", Course: " + course;
    }
}