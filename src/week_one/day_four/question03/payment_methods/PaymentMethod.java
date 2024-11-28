package src.week_one.day_four.question03.payment_methods;

import src.week_one.day_four.question03.bank_accounts.BankAccount;

public interface PaymentMethod {
    void makePayment(BankAccount fromAccount, BankAccount toAccount, double amount);

}
