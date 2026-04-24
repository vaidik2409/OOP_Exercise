import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double rate;

    void setRate(double rate) {
        this.rate = rate;
    }

    double calculateInterest() {
        return balance * rate;
    }
}

class FixedDepositAccount extends BankAccount {
    double rate;
    int years;

    void setDetails(double rate, int years) {
        this.rate = rate;
        this.years = years;
    }

    double maturityAmount() {
        return balance * Math.pow(1 + rate, years);
    }
}

public class pra14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();

        System.out.print("Enter Saving Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        sa.openAccount(accNo, name, bal);

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();
        sa.deposit(dep);

        System.out.print("Enter Withdraw Amount: ");
        double wd = sc.nextDouble();
        sa.withdraw(wd);

        sa.checkBalance();

        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();
        sa.setRate(rate);

        System.out.println("Calculated Interest: " + sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();

        sc.nextLine();

        System.out.print("Enter Fixed Deposit Account Number: ");
        String fdAcc = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String fdName = sc.nextLine();

        System.out.print("Enter Initial Deposit Amount: ");
        double fdBal = sc.nextDouble();

        fd.openAccount(fdAcc, fdName, fdBal);

        System.out.print("Enter Interest Rate: ");
        double fdRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        fd.setDetails(fdRate, years);

        System.out.println("Maturity Amount: " + fd.maturityAmount());
    }
}