import java.util.*;

public class Main {
    static int nextId = 1001;
    static Scanner sc = new Scanner(System.in);
    
    static class Account {
        int id;
        String name;
        double balance;
        List<String> transactions = new ArrayList<>();
        
        Account(String name, double balance) {
            this.id = nextId++;
            this.name = name;
            this.balance = balance;
            transactions.add("Account created: " + balance);
        }
    }
    
    static List<Account> accounts = new ArrayList<>();
    
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n╔════════════════════════╗");
            System.out.println("║   BANKING SYSTEM       ║");
            System.out.println("╠════════════════════════╣");
            System.out.println("║ 1. Create Account      ║");
            System.out.println("║ 2. Login               ║");
            System.out.println("║ 3. View All Accounts   ║");
            System.out.println("║ 4. Exit                ║");
            System.out.println("╚════════════════════════╝");
            System.out.print("Choose: ");
            
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                createAccount();
            } else if (choice == 2) {
                login();
            } else if (choice == 3) {
                viewAllAccounts();
            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
    
    static void createAccount() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();
        
        if (balance < 0) {
            System.out.println("Balance cannot be negative");
            return;
        }
        
        Account acc = new Account(name, balance);
        accounts.add(acc);
        System.out.println("Account created! ID: " + acc.id);
    }
    
    static void login() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found");
            return;
        }
        
        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        Account acc = null;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).id == id) {
                acc = accounts.get(i);
                break;
            }
        }
        
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        
        accountMenu(acc);
    }
    
    static void accountMenu(Account acc) {
        int choice;
        while (true) {
            System.out.println("\n╔════════════════════════╗");
            System.out.println("║ " + String.format("%-20s", acc.name + "'s Account") + " ║");
            System.out.println("╠════════════════════════╣");
            System.out.println("║ 1. Show Details        ║");
            System.out.println("║ 2. Deposit             ║");
            System.out.println("║ 3. Withdraw            ║");
            System.out.println("║ 4. Transaction History ║");
            System.out.println("║ 5. Logout              ║");
            System.out.println("╚════════════════════════╝");
            System.out.print("Choose: ");
            
            choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                System.out.println("ID: " + acc.id);
                System.out.println("Name: " + acc.name);
                System.out.println("Balance: " + acc.balance);
            } else if (choice == 2) {
                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                
                if (amount <= 0) {
                    System.out.println("Amount must be positive");
                } else {
                    acc.balance += amount;
                    acc.transactions.add("Deposited: " + amount);
                    System.out.println("Success! New balance: " + acc.balance);
                }
            } else if (choice == 3) {
                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                
                if (amount <= 0) {
                    System.out.println("Amount must be positive");
                } else if (amount > acc.balance) {
                    System.out.println("Insufficient balance");
                } else {
                    acc.balance -= amount;
                    acc.transactions.add("Withdrawn: " + amount);
                    System.out.println("Success! New balance: " + acc.balance);
                }
            } else if (choice == 4) {
                System.out.println("\n╔════════════════════════╗");
                System.out.println("║ Transaction History    ║");
                System.out.println("╠════════════════════════╣");
                for (int i = 0; i < acc.transactions.size(); i++) {
                    System.out.println("║ " + (i + 1) + ". " + String.format("%-19s", acc.transactions.get(i)) + " ║");
                }
                System.out.println("╚════════════════════════╝");
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
    
    static void viewAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found");
            return;
        }
        
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ All Accounts                   ║");
        System.out.println("╠════════════════════════════════╣");
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            System.out.println("║ " + acc.id + " | " + String.format("%-8s", acc.name) + " | " + String.format("%8.2f", acc.balance) + " ║");
        }
        System.out.println("╚════════════════════════════════╝");
    }
}

