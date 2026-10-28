class Student {

    private String name;
    private int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        }
    }
}

class Main {
    public static void main(String[] args) {

        Student s = new Student("Sahana", 80);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());

        s.setMarks(90);
        System.out.println("Updated Marks: " + s.getMarks());

        s.setMarks(150);
        System.out.println("Final Marks: " + s.getMarks());
    }
}
