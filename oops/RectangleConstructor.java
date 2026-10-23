class RectangleConstructor {

    int length;
    int width;

    // Constructor
    RectangleConstructor(int l, int w) {
        length = l;
        width = w;
    }

    // Method
    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        RectangleConstructor r1 = new RectangleConstructor(10, 5);

        int area = r1.calculateArea();

        System.out.println("Area: " + area);
    }
}
