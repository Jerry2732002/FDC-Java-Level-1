package src.week_one.day_four.question03.bank_accounts;

import src.week_one.day_four.question03.AccountType;
import src.week_one.day_four.question03.BankAccount;

public class CheckingAccount extends BankAccount {

    static final double MINIMUM_BALANCE = 500;

    public CheckingAccount(long accountNo, double balance) {
        super(accountNo, balance, AccountType.CHECKING_ACCOUNT);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
        }else{
            if((balance - amount) < MINIMUM_BALANCE) {
                System.out.println("Minimum Balance Violated");
            }
            balance -= amount;
        }

    }
}
