class StudentThis {
    String name;
    int age;

    // Constructor 1
    StudentThis() {
        this("Unknown", 0);
    }

    // Constructor 2
    StudentThis(String n, int a) {
        name = n;
        age = a;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentThis s1 = new StudentThis();
        s1.displayDetails();
    }
}
