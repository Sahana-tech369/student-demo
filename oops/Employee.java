class Employee {

    String name;
    int id;
    double salary;

    // Parameterized constructor
    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 101, 25000.0);

        e1.displayDetails();
    }
}
