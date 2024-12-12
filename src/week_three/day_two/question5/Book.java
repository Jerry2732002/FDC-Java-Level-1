package src.week_three.day_two.question5;

import java.util.Objects;

public class Book implements Comparable<Book> {
    public String bookName;
    public String author;

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return this.bookName.equalsIgnoreCase(that.bookName) && this.author.equalsIgnoreCase(that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName);
    }

    @Override
    public int compareTo(Book o) {
        if (bookName.compareTo(o.bookName) == 0) {
            return author.compareTo(o.author);
        }
        return bookName.compareTo(o.bookName);
    }

    public void printDetails() {
        System.out.print("[Name: " + bookName + " Author: " + author + "],");
    }
}