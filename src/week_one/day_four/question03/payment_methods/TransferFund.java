package src.week_one.day_four.question03.payment_methods;

import src.week_one.day_four.question03.bank_accounts.BankAccount;

public class TransferFund {
    public static void transferFund(PaymentMethod paymentMethod, BankAccount fromAccount, BankAccount toAccount, double amount){
        paymentMethod.makePayment(fromAccount,toAccount,amount);
        toAccount.printDetails();
        fromAccount.printDetails();
    }
}
