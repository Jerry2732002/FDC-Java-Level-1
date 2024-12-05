package src.week_two.day_three.question04;

import src.week_two.day_three.question04.exceptions.book.BookNotAvailableException;
import src.week_two.day_three.question04.exceptions.book.InvalidReturnException;
import src.week_two.day_three.question04.exceptions.user.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<User> userList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void addBook(List books) {
        bookList.addAll(books);
    }

    public void addUser(List users) {
        userList.addAll(users);
    }

    public User getUser(String userId) {
        for (User user : userList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public Book getBook(String bookTitle) {
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllAvailableBook() {
        System.out.println("Available books are: ");
        if (bookList.isEmpty()) {
            System.out.println("No books are available.");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                Book book = bookList.get(i);
                System.out.println((i + 1) + ". " + book.getBookTitle());
            }
        }
    }

    public void borrowBook(String bookTitle, String userId) {
        Book book = getBook(bookTitle);
        User user = getUser(userId);

        if (user == null) {
            throw new UserNotFoundException("No user with id:" + userId);
        }
        if (book == null) {
            displayAllAvailableBook();
            throw new BookNotAvailableException("No book with title :" + bookTitle);
        }
        bookList.remove(book);
        user.borrowBook(book);
        System.out.println("User : " + user.getUserName() + " has borrowed " + bookTitle);
    }

    public void returnBook(String bookTitle, String userId) {
        User user = getUser(userId);
        if (user == null) {
            throw new UserNotFoundException("No user with id:" + userId);
        }
        if (!user.checkIfBookBorrowed(bookTitle)) {
            throw new InvalidReturnException("User:" + user.getUserName() + " has not borrowed " + bookTitle);
        }
        bookList.add(user.returnBorrowedBook(bookTitle));
        System.out.println("User : " + user.getUserName() + " has returned " + bookTitle);
    }
}
