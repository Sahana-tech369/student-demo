class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw();
        r.draw();
    }
}
