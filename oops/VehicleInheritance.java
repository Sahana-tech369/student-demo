class Vehicle {
    String brand = "Toyota";

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.displayBrand();
        c1.drive();
    }
}
