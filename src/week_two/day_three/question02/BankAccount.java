package src.week_two.day_three.question02;

import src.week_two.day_three.question02.exceptions.InsufficentFundException;
import src.week_two.day_three.question02.exceptions.InvalidAmountException;

public class BankAccount {
    private final int accountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) throws IllegalArgumentException {
        if (accountNumber < 0) {
            throw new IllegalArgumentException("Account number cannot be negative");
        }
        this.accountNumber = accountNumber;

        if (accountHolderName == null || accountHolderName.isEmpty()) {
            throw new IllegalArgumentException("Account Holder Name cannot be empty or null");
        }
        this.accountHolderName = accountHolderName;

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("You cannot deposit negative amount");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficentFundException {
        if (amount < 0) {
            throw new InvalidAmountException("You cannot deposit negative amount");
        }
        if (this.balance - amount < 0) {
            throw new InsufficentFundException("Account Holder : " + this.accountHolderName + " cannot withdraw : " + amount + ", Available balance is : " + this.balance);
        }
        this.balance -= amount;
    }

    public void transfer(double amount, BankAccount toAccount) throws InvalidAmountException, InsufficentFundException {
        if (this.balance - amount < 0) {
            throw new InsufficentFundException("Account Holder : " + this.accountHolderName + " cannot withdraw : " + amount + ", Available balance is : " + this.balance);
        }
        this.withdraw(amount);
        toAccount.deposit(amount);
    }

    public void printDetails() {
        System.out.println("\n\n************************************************");
        System.out.println("Account Holder Name : " + this.accountHolderName + "\nBalance : " + this.balance);
    }
}
