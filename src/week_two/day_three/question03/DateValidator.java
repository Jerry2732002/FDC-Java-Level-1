package src.week_two.day_three.question03;

import src.week_two.day_three.question03.exceptions.InvalidDayException;
import src.week_two.day_three.question03.exceptions.InvalidMonthException;
import src.week_two.day_three.question03.exceptions.InvalidYearException;

public class DateValidator {
    private static int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static final String[] MONTH_IN_YEAR = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


    private boolean checkLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public void validateDate(int day, int month, int year) throws InvalidYearException, InvalidMonthException, InvalidDayException {
        if (year <= 0) {
            throw new InvalidYearException("Year Cannot Be Negative Or Zero");
        }
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Month should be between 1-12");
        }
        int maxDays = DAYS_IN_MONTH[month - 1];
        if (checkLeapYear(year) && month == 2) {
            maxDays = 29;
        }
        if (day <= 0 || day > maxDays) {
            throw new InvalidDayException(MONTH_IN_YEAR[month - 1] + " of Year " + year + " has day between 1 & " + maxDays);
        }
        System.out.println("Date : " + day + "-" + month + "-" + year + " is a valid date");
    }
}
