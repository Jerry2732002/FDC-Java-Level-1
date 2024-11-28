package src.week_one.day_four.question03.payment_methods;

public enum AccountType{
    SAVINGS_ACCOUNT(0.5),
    CHECKING_ACCOUNT(0);

    double transactionFee;
    AccountType(double transactionFee){
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee(){
        return this.transactionFee;
    }
}
