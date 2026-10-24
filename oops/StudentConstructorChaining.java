class StudentConstructorChaining {
    String name;
    int age;

    // Constructor 1: accepts only name
    StudentConstructorChaining(String name) {
        this(name, 18);
    }

    // Constructor 2: accepts name and age
    StudentConstructorChaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentConstructorChaining s1 =
                new StudentConstructorChaining("Sahana");
        StudentConstructorChaining s2 =
                new StudentConstructorChaining("Rahul", 21);

        s1.displayDetails();
        s2.displayDetails();
    }
}
