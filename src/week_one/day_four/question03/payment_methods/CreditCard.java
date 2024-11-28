package src.week_one.day_four.question03.payment_methods;

import src.week_one.day_four.question03.bank_accounts.BankAccount;


//Has transactional charge of Rs.5 and only Checking account holder have credit card
public class CreditCard implements PaymentMethod {
    static final double CREDIT_CARD_CHARGE = 5;
    @Override
    public void makePayment(BankAccount fromAccount,BankAccount toAccount, double amount) {
        if(fromAccount.getAccountType() == AccountType.SAVINGS_ACCOUNT) {
            System.out.println("Credit NOT ALLOWED");
        }else {
            fromAccount.withdraw(amount + CREDIT_CARD_CHARGE);
            toAccount.deposit(amount);
        }
    }
}
