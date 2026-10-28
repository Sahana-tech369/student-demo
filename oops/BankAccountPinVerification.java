class BankAccount {
    private int pin;

    BankAccount(int pin) {
        this.pin = pin;
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1234);

        System.out.println(account.verifyPin(1234));
        System.out.println(account.verifyPin(5678));
    }
}
