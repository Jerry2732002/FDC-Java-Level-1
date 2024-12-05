package src.week_two.day_three.question02.exceptions;

public class InsufficentFundException extends BankingException{
    public InsufficentFundException(String message) {
        super(message);
    }
}
