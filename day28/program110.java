import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    void createAccount(Scanner scnr) {
        System.out.print("Enter Account Number: ");
        accountNumber = scnr.nextInt();
        scnr.nextLine(); // consume newline

        System.out.print("Enter Account Holder Name: ");
        accountHolder = scnr.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = scnr.nextDouble();

        System.out.println("Account created successfully.");
    }

    void deposit(Scanner scnr) {
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = scnr.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(Scanner scnr) {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scnr.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class program110{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        int choice;

        do {
            System.out.println("\n--- Bank Account System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    acc.createAccount(scnr);
                    break;

                case 2:
                    acc.deposit(scnr);
                    break;

                case 3:
                    acc.withdraw(scnr);
                    break;

                case 4:
                    acc.checkBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scnr.close();
    }
}