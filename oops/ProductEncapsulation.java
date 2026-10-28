class Product {

    private String productName;
    private double price;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        setPrice(price);
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be greater than zero.");
        }
    }
}

class Main {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 50000);

        System.out.println("Product: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());

        p.setPrice(45000);
        System.out.println("Updated Price: " + p.getPrice());

        p.setPrice(0);
        System.out.println("Final Price: " + p.getPrice());

        p.setPrice(-100);
        System.out.println("Final Price: " + p.getPrice());
    }
}
