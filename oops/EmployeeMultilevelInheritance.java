class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

class SeniorDeveloper extends Developer {
    void reviewCode() {
        System.out.println("Senior developer is reviewing code");
    }
}

class Main {
    public static void main(String[] args) {
        SeniorDeveloper s1 = new SeniorDeveloper();

        s1.work();
        s1.writeCode();
        s1.reviewCode();
    }
}
