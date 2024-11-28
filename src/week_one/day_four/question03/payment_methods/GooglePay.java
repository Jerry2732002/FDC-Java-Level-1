package src.week_one.day_four.question03.payment_methods;

import src.week_one.day_four.question03.bank_accounts.BankAccount;

//GooglePay has no transaction charage
public class GooglePay implements PaymentMethod {
    @Override
    public void makePayment(BankAccount fromAccount, BankAccount toAccount, double amount) {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
