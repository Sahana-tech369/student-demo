class BankAccountThisKeyword {
    String accountHolder;
    double balance;

    // Parameterized constructor
    BankAccountThisKeyword(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method
    void displayDetails() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccountThisKeyword b1 =
                new BankAccountThisKeyword("Sahana", 5000.0);
        b1.displayDetails();
    }
}
