package src.week_two.day_three;

import src.week_two.day_three.question01.Car;
import src.week_two.day_three.question01.exceptions.*;
import src.week_two.day_three.question02.BankAccount;
import src.week_two.day_three.question02.exceptions.InsufficentFundException;
import src.week_two.day_three.question02.exceptions.InvalidAmountException;
import src.week_two.day_three.question03.DateValidator;
import src.week_two.day_three.question03.exceptions.DateException;
import src.week_two.day_three.question03.exceptions.InvalidDayException;
import src.week_two.day_three.question03.exceptions.InvalidMonthException;
import src.week_two.day_three.question03.exceptions.InvalidYearException;
import src.week_two.day_three.question04.Book;
import src.week_two.day_three.question04.Library;
import src.week_two.day_three.question04.User;
import src.week_two.day_three.question04.exceptions.book.BookException;

import java.util.Arrays;


public class WeekTwoDayThreeExecutable {

    static void executeCar(Car car, int id) {
        try {
            car.findMyCar(id);

            try {
                car.drive();
            } catch (LowFuelException e) {
                System.out.println(e.getMessage());
            }
            try {
                car.accelerate(10);
            } catch (SpeedLimitExceededException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            try {
                car.isUnitAvailable(15);
            } catch (UnitsExceededException e) {
                System.out.println(e.getMessage());
            }
            try {
                car.checkMalfunction();
            } catch (CarMalfunctionException e) {
                System.out.println(e.getMessage());
            }

        } catch (CarNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void executeQuestion1() {

        Car car1 = new Car(1001, 40, 20, 8);
        Car car2 = new Car(1002, 80, 10, 5);
        //          CAR 1
        System.out.println("CAR 1 : ");
        executeCar(car1, 1001);
        //          CAR 2
        System.out.println("CAR 2 : ");
        executeCar(car2, 1002);

    }

    public static void executeQuestion2() {
        BankAccount jerryAccount = new BankAccount(1001, "Jerry", 20000);
        BankAccount akashAccount = new BankAccount(1002, "Akash", 25000);
        BankAccount bibinAccount = new BankAccount(1003, "Bibin", 10000);

        try {
            jerryAccount.deposit(2000);
            jerryAccount.printDetails();
        } catch (InvalidAmountException e) {
            System.out.println("\n\n" + e.getMessage());
        }
        try {
            akashAccount.withdraw(250000);
            akashAccount.printDetails();
        } catch (InvalidAmountException | InsufficentFundException e) {
            System.out.println("\n\n" + e.getMessage());
        }
        try {
            jerryAccount.transfer(20000, bibinAccount);
            jerryAccount.printDetails();
            bibinAccount.printDetails();
        } catch (InvalidAmountException | InsufficentFundException e) {
            System.out.println("\n\n" + e.getMessage());
        }
    }

    public static void executeQuestion3() {
        DateValidator validator = new DateValidator();
        try {
            validator.validateDate(24, 4, 2002);
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }
        try {
            validator.validateDate(32, 2, 2012);
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }
        try {
            validator.validateDate(32, 2, 2013);
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }
        try {
            validator.validateDate(1, 14, 2001);
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }
        try {
            validator.validateDate(1, 4, 0);
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void executeQuestion4() {
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("Game of Thrones", "George R.R. Martin");
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book4 = new Book("1984", "George Orwell");
        Book book5 = new Book("To Kill a Mockingbird", "Harper Lee");

        User jerry = new User("Jerry", "1001");
        User sam = new User("Sam", "1002");
        User alice = new User("Alice", "1003");


        library.addBook(Arrays.asList(book1, book2, book3, book4, book5));
        library.addUser(Arrays.asList(jerry, sam, alice));
        //User 1001 borrows book Harry Potter
        try {
            library.borrowBook("Harry Potter", "1001");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        //User 1002 cannot borrow Harry Potter as 1001 has it
        try {
            library.borrowBook("Harry Potter", "1002");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        //User 1001 returns book Harry Potter
        try {
            library.returnBook("Harry Potter", "1001");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        //User 1002 borrows book Harry Potter as it in library
        try {
            library.borrowBook("Harry Potter", "1002");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        //1001 tries to return book he didn't borrow
        try {
            library.returnBook("Game of Thrones", "1001");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        //non-user tries to borrow a book
        try {
            library.returnBook("The Hobbit", "1005");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}

