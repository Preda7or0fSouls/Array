package PPOO;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book {
    // The fields.
    private String author;

    private String title;

    private int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    public String getAuthor() {

        return author;
    }

    public void printAuthor()
    {
        System.out.print(author);
    }

    public String getTitle() {
        return title;
    }

    public void printTitle() {

        System.out.print(title);
    }
}
