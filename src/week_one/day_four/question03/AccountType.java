package src.week_one.day_four.question03;

public enum AccountType{
    SAVINGS_ACCOUNT(0.5),
    CHECKING_ACCOUNT(0);

    double trasactionFee;
    AccountType(double trasactionFee){
        this.trasactionFee = trasactionFee;
    }
}
