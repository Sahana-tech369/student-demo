class Rectangle {

    int length;
    int width;

    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        int area = r1.calculateArea();

        System.out.println("Area: " + area);
    }
}
