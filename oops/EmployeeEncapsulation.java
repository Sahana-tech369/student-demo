class Employee {

    private String name;
    private double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }
}

class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Sahana", 30000);

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());

        e.setSalary(35000);
        System.out.println("Updated Salary: " + e.getSalary());

        e.setSalary(-5000);
        System.out.println("Final Salary: " + e.getSalary());
    }
}
