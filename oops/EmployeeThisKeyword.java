class EmployeeThisKeyword {
    int id;
    String name;
    double salary;

    EmployeeThisKeyword(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeThisKeyword e1 =
                new EmployeeThisKeyword(101, "Rahul", 25000.0);
        e1.displayDetails();
    }
}
