class RectangleConstructorChaining {
    int length;
    int width;

    // Constructor 1: One value
    RectangleConstructorChaining(int side) {
        this(side, side);
    }

    // Constructor 2: Separate length and width
    RectangleConstructorChaining(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        RectangleConstructorChaining r1 =
                new RectangleConstructorChaining(5);
        RectangleConstructorChaining r2 =
                new RectangleConstructorChaining(10, 4);

        r1.displayDetails();
        System.out.println();

        r2.displayDetails();
    }
}
