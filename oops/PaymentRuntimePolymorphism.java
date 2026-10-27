class Payment {

    void pay() {
        System.out.println("Making a payment");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using UPI");
    }
}

class CardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Card");
    }
}

class CashPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Cash");
    }
}

class Main {
    public static void main(String[] args) {

        Payment p;

        p = new UPIPayment();
        p.pay();

        p = new CardPayment();
        p.pay();

        p = new CashPayment();
        p.pay();
    }
}
