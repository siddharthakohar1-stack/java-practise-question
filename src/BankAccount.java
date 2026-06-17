//Siddhartha Kohar - 116234
class BankAccount {
    private String accountNumber;
    private double balance; // Sealed private field to prevent external tampering

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        // Ensure starting balance isn't negative
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Encapsulated safe business logic mutation method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Transaction Rejected: Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Transaction Rejected: Insufficient funds. Available: $" + this.balance);
        } else {
            this.balance -= amount; // Deduct safely after all validations pass
            System.out.println("Withdrawal Successful: Dispensed $" + amount);
        }
    }

    // Safe read-only accessor (Getter)
    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
}