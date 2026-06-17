//Siddhartha Kohar - 116234
public class AtmSimulationApp {
    public static void main(String[] args) {
        // Initializing a new account with $500.00
        BankAccount account = new BankAccount("ACC-78945", 500.00);

        System.out.println("Welcome to SecureATM. Account ID: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());
        System.out.println("---------------------------------------------");

        // Test Case 1: Standard legitimate validation pass
        System.out.println("Attempting to withdraw $150.00...");
        account.withdraw(150.00);
        System.out.println("Updated Balance: $" + account.getBalance());
        System.out.println("---------------------------------------------");

        // Test Case 2: Attempting an overdrawn amount fault state
        System.out.println("Attempting to withdraw $400.00...");
        account.withdraw(400.00);
        System.out.println("Current Balance remains: $" + account.getBalance());
        System.out.println("---------------------------------------------");

        // Test Case 3: Malicious/Erroneous negative input logic pass
        System.out.println("Attempting to withdraw -$50.00...");
        account.withdraw(-50.00);
        System.out.println("Final Account Balance: $" + account.getBalance());
    }
}