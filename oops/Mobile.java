class Mobile {
    String brand;
    double price;

    // No-argument constructor
    Mobile() {
        brand = "Samsung";
        price = 15000.0;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.displayDetails();
    }
}
