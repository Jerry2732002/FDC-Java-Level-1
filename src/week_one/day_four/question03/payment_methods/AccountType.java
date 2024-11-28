package src.week_one.day_four.question03.payment_methods;

public enum AccountType{
    SAVINGS_ACCOUNT(100),
    CHECKING_ACCOUNT(200);

    double monthlyCharge;
    AccountType(double monthlyCharge){
        this.monthlyCharge = monthlyCharge;
    }

    public double getTransactionFee(){
        return this.monthlyCharge;
    }
}
