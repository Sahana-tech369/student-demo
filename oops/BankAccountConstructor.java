class BankAccountConstructor {

    String accountHolder;
    double balance;

    // Constructor
    BankAccountConstructor(String name, double amount) {
        accountHolder = name;
        balance = amount;
    }

    // Method
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccountConstructor account1 =
                new BankAccountConstructor("Sahana", 5000.0);

        BankAccountConstructor account2 =
                new BankAccountConstructor("Rahul", 10000.0);

        account1.displayDetails();
        account2.displayDetails();
    }
}
