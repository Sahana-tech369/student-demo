class StudentThisKeyword {
    String name;
    int age;

    StudentThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentThisKeyword s1 = new StudentThisKeyword("Sahana", 21);
        s1.displayDetails();
    }
}
