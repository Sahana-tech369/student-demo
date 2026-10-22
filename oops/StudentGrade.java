class StudentGrade {

    String name;
    int marks;

    void displayGrade() {

        System.out.println("Name: " + name);

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {

        StudentGrade s1 = new StudentGrade();

        s1.name = "Sahana";
        s1.marks = 85;

        s1.displayGrade();
    }
}
