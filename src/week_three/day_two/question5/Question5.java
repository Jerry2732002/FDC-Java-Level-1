package src.week_three.day_two.question5;

public class Question5 {
    public static void execute() {
        Book book1 = new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone");
        Book book2 = new Book("George Orwell", "1984");
        Book book3 = new Book("J.R.R. Tolkien", "The Hobbit");
        Book book4 = new Book("Harper Lee", "To Kill a Mockingbird");
        Book book5 = new Book("George Orwell", "1984");
        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);
        Library.addBook(book4);
        Library.listBooks();


        Library.addBook(book5);
        Library.listBooks();
    }
}
