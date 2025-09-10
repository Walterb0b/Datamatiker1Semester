package Lesson06.Book;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("The Fellowship of the Ring", "Tolkien", 430, 150, false);

        book.setAvailable(true);
        System.out.println(book);
    }
}
