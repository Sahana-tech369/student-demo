class StudentConstructor {

    String name;
    int age;

    // Constructor
    StudentConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        StudentConstructor s1 = new StudentConstructor("Sahana", 21);

        s1.displayDetails();
    }
}
