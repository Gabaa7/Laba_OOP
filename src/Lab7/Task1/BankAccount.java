package Lab7.Task1;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(int accountNumber) {
        this(accountNumber, 0);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Баланс повинен бути додатнім!!!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Ваш баланс після поповнення рахунку:" + balance);
        } else {
            System.out.println("Сума депозиту повинна бути додатньою!!!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Ваш баланс після зняття:" + balance);
        } else {
            System.out.println("Недостатньо коштів на рахунку");
        }
    }

}