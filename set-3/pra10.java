import java.util.Scanner;

public class pra10 {

    static class BankAccount {
        private String accountHolderName;
        private double balance;
        private static double interestRate; 

        public BankAccount(String accountHolderName, double balance) {
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public double calculateInterest() {
            return balance * interestRate / 100;
        }

        public void displayAccount() {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Interest Earned: " + calculateInterest());
        }

        public static void updateInterestRate(double newRate) {
            interestRate = newRate;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the interest rate for all accounts (%): ");
        double rate = sc.nextDouble();
        BankAccount.updateInterestRate(rate);

        sc.nextLine(); 

        System.out.print("\nEnter account holder name for account 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter balance for account 1: ");
        double balance1 = sc.nextDouble();
        BankAccount account1 = new BankAccount(name1, balance1);

        sc.nextLine();

        System.out.print("\nEnter account holder name for account 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter balance for account 2: ");
        double balance2 = sc.nextDouble();
        BankAccount account2 = new BankAccount(name2, balance2);

        System.out.println("\nAccount 1 Details:");
        account1.displayAccount();

        System.out.println("\nAccount 2 Details:");
        account2.displayAccount();
    }
}
