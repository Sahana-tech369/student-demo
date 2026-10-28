interface Printable {

    void print();
}

class Book implements Printable {

    @Override
    public void print() {
        System.out.println("Printing a book");
    }
}

class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing a report");
    }
}

class Main {

    public static void main(String[] args) {

        Book b = new Book();
        Report r = new Report();

        b.print();
        r.print();
    }
}
