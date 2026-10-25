class AnimalOverriding {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogOverriding extends AnimalOverriding {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatOverriding extends AnimalOverriding {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class AnimalMethodOverriding {
    public static void main(String[] args) {
        DogOverriding d1 = new DogOverriding();
        CatOverriding c1 = new CatOverriding();

        d1.sound();
        c1.sound();
    }
}
