class Car {

    String brand;
    double price;

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.price = 5000000;

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.price = 2000000;

        System.out.println("Car 1: " + car1.brand);
        System.out.println("Price: " + car1.price);

        System.out.println("Car 2: " + car2.brand);
        System.out.println("Price: " + car2.price);
    }
}
