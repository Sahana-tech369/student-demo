abstract class Shape {

    abstract double calculateArea();
}

class Circle extends Shape {

    double radius = 5;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length = 4;
    double width = 6;

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Main {

    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        System.out.println("Circle area: " + s.calculateArea());

        s = new Rectangle();
        System.out.println("Rectangle area: " + s.calculateArea());
    }
}
