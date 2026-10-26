class Employee {

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        double monthlySalary = 30000;
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        int hoursWorked = 80;
        double hourlyRate = 200;
        return hoursWorked * hourlyRate;
    }
}

class Main {

    public static void main(String[] args) {

        FullTimeEmployee fullTime = new FullTimeEmployee();
        PartTimeEmployee partTime = new PartTimeEmployee();

        System.out.println("Full-time salary: " + fullTime.calculateSalary());
        System.out.println("Part-time salary: " + partTime.calculateSalary());
    }
}
