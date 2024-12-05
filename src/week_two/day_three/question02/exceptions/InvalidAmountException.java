package src.week_two.day_three.question02.exceptions;

public class InvalidAmountException extends BankingException{
    public InvalidAmountException(String message) {
        super(message);
    }
}
