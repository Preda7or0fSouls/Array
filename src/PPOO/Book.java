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

    private String refNumber = "";

    private int borrowed;

    private boolean courseText;

    public Book(String author, String title, int pages, String refNumber, boolean courseText) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.refNumber = refNumber;
        this.courseText = courseText;

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
    public int getPages() {

        return pages;
    }
    public void setRefNumber(String ref){
        if(ref.length() >=4 ){
            refNumber = ref;
        }else{
            Sys
        }

    }


    /**
     * get field
     *
     * @return borrowed
     */
    public int getBorrowed() {
        return this.borrowed;
        borrowed++;
    }

    /**
     * set field
     *
     * @param borrowed
     */
    public void setBorrowed(int borrowed) {
        this.borrowed = borrowed;

    }
    public void setCourseText(isCouseText){

    }
}
