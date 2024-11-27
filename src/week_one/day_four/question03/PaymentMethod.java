package src.week_one.day_four.question03;

public interface PaymentMethod {
    void makePayment(BankAccount fromAccount, BankAccount toAccount, double amount);

}
