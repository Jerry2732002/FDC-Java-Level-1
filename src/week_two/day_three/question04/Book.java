package src.week_two.day_three.question04;

import src.week_two.day_three.question04.exceptions.book.InvalidBookTitle;

public class Book {
    private String bookTitle;
    private String author;

    public Book(String bookTitle, String author) {
        if (bookTitle == null || bookTitle.isEmpty()) {
            throw new InvalidBookTitle("Invalid book Title : " + bookTitle);
        }
        this.bookTitle = bookTitle;
        if (author == null || author.isEmpty()) {
            throw new InvalidBookTitle("Invalid Author name : " + author);
        }
        this.author = author;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
}
