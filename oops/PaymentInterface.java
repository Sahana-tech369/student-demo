interface Payment {

    void pay();
}

class UPIPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

class CardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using Card");
    }
}

class Main {

    public static void main(String[] args) {

        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();

        upi.pay();
        card.pay();
    }
}
