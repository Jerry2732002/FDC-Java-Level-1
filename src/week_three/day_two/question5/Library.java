package src.week_three.day_two.question5;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private static Set<Book> books = new HashSet<>();

    static void addBook(Book book) {
        books.add(book);
    }
    static void listBooks() {
        Set<Book> sortedBooks = new TreeSet<>(books);
        for (Book book : sortedBooks) {
            book.printDetails();
        }
        System.out.println();
    }
}