package src.week_one.day_four.question03.bank_accounts;

import src.week_one.day_four.question03.payment_methods.AccountType;

public abstract class BankAccount {
    protected long accountNo;
    protected double balance;
    protected AccountType accountType;

    public BankAccount(long accountNo, double balance, AccountType accountType) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }
    public void printDetails(){
        System.out.println("**********************************");
        System.out.println("Account no : " + this.accountNo + "\nBalance :" + this.balance);
    }

    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);
}
