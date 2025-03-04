public class student {
    private String id;
    private String name;
    private String program;

    public student(String id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;

    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Program: " + program;
    }
    
}
