import java.util.Scanner;

class Account {
    String name;
    String accNo;
    double balance;

    Account(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        Account user = new Account(name, accNo, 0);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    user.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with = sc.nextDouble();
                    user.withdraw(with);
                    break;
                case 3:
                    user.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}import java.util.Scanner;

class Account {
    String name;
    String accNo;
    double balance;

    Account(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        Account user = new Account(name, accNo, 0);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    user.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with = sc.nextDouble();
                    user.withdraw(with);
                    break;
                case 3:
                    user.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
