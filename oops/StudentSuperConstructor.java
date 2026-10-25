class Person {
    String name;

    // Parent constructor
    Person(String name) {
        this.name = name;
    }
}

class StudentSuperConstructor extends Person {
    int age;

    // Child constructor
    StudentSuperConstructor(String name, int age) {
        super(name);
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentSuperConstructor s1 =
                new StudentSuperConstructor("Sahana", 21);
        s1.displayDetails();
    }
}
