import java.util.ArrayList;
import java.util.Scanner;

class Account {
    int accountNumber;
    String name;
    double balance;

    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Not enough balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class BankManagementSystem {

    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Account findAccount(int accNo) {
        for (Account a : accounts) {
            if (a.accountNumber == accNo) {
                return a;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double balance = sc.nextDouble();
                    accounts.add(new Account(accNo, name, balance));
                    System.out.println("Account created!");
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    Account acc = findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Deposit amount: ");
                        double amount = sc.nextDouble();
                        acc.deposit(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    acc = findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Withdraw amount: ");
                        double amount = sc.nextDouble();
                        acc.withdraw(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    acc = findAccount(accNo);
                    if (acc != null) {
                        acc.display();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts!");
                    } else {
                        for (Account a : accounts) {
                            a.display();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}