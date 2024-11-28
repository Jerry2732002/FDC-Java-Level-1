package src.week_one.day_four.question03.bank_accounts;

import src.week_one.day_four.question03.payment_methods.AccountType;
import src.week_one.day_four.question03.payment_methods.PaymentMethod;

public abstract class BankAccount {
    protected long accountNo;
    protected double balance;
    protected AccountType accountType;

    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);

    public BankAccount(long accountNo, double balance, AccountType accountType) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void printDetails() {
        System.out.println("**********************************");
        System.out.println("Account no : " + this.accountNo + "\nBalance :" + this.balance);
    }

    public static void transferFund(PaymentMethod paymentMethod, BankAccount fromAccount, BankAccount toAccount, double amount) {
        paymentMethod.makePayment(fromAccount, toAccount, amount);
        toAccount.printDetails();
        fromAccount.printDetails();
    }
}
