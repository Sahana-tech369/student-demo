abstract class Employee {

    abstract int calculateSalary();
}

class FullTimeEmployee extends Employee {

    @Override
    int calculateSalary() {
        return 30000;
    }
}

class PartTimeEmployee extends Employee {

    @Override
    int calculateSalary() {
        return 10000;
    }
}

class Main {

    public static void main(String[] args) {

        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time salary: " + e.calculateSalary());

        e = new PartTimeEmployee();
        System.out.println("Part-time salary: " + e.calculateSalary());
    }
}
