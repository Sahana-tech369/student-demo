class Display {

    // Accept a String
    void show(String name) {
        System.out.println("Name: " + name);
    }

    // Accept an int
    void show(int age) {
        System.out.println("Age: " + age);
    }

    // Accept a String and an int
    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Display d = new Display();

        d.show("Sahana");
        d.show(20);
        d.show("Sahana", 20);
    }
}
