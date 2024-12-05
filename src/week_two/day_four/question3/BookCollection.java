package src.week_two.day_four.question3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookCollection {
    List<Book> books = Arrays.asList(
            new Book("The Hobbit", "J.R.R. Tolkien", 1937),
            new Book("1984", "George Orwell", 1949),
            new Book("Animal Farm", "George Orwell", 1945)
    );

    public void sortBook() {
        Collections.sort(books, Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getPublicationYear)
                .thenComparing(Book::getTitle)
        );
        System.out.println("Sorted Books:");
        for (Book book : books) {
            System.out.println("\""+book.getTitle()+"\" by " + book.getAuthor() + "("+book.getPublicationYear()+")");
        }
    }
}
