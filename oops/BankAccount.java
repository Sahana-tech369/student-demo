class BankAccount {

    String accountHolder;
    double balance;

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountHolder = "Sahana";
        account.balance = 5000.0;

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Balance: " + account.balance);
    }
}
