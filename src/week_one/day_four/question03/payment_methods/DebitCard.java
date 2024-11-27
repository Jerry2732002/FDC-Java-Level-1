package src.week_one.day_four.question03.payment_methods;

import src.week_one.day_four.question03.AccountType;
import src.week_one.day_four.question03.BankAccount;
import src.week_one.day_four.question03.PaymentMethod;

//Has transactional charge of Rs.2
public class DebitCard implements PaymentMethod {
    static final double DEBIT_CARD_CHARGE = 2;

    @Override
    public void makePayment(BankAccount fromAccount, BankAccount toAccount, double amount) {
        fromAccount.withdraw(amount + DEBIT_CARD_CHARGE);
        toAccount.deposit(amount);
    }
}

