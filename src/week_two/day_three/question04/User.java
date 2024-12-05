package src.week_two.day_three.question04;

import src.week_two.day_three.question04.exceptions.user.InvalidUserIdException;
import src.week_two.day_three.question04.exceptions.user.InvalidUserNameException;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String userId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String userName, String userId) {
        if (userName == null || userName.isEmpty()) {
            throw new InvalidUserNameException("Invalid username : " + userName);
        }
        this.userName = userName;
        if (userId == null || userId.isEmpty()) {
            throw new InvalidUserIdException("Invalid user id : " + userId);
        }
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public boolean checkIfBookBorrowed(String bookTitle) {
        for (Book book : borrowedBooks) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                return true;
            }
        }
        return false;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public Book returnBorrowedBook(String bookTitle) {
        for (Book book : borrowedBooks) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                borrowedBooks.remove(book);
                return book;
            }
        }
        return null;
    }
}
