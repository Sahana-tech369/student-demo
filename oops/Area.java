class Area {

    // Area of a square
    int calculateArea(int side) {
        return side * side;
    }

    // Area of a rectangle
    int calculateArea(int length, int width) {
        return length * width;
    }

    // Area of a circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("Square area: " + a.calculateArea(5));
        System.out.println("Rectangle area: " + a.calculateArea(4, 6));
        System.out.println("Circle area: " + a.calculateArea(3.0));
    }
}
