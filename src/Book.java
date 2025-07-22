package src;


public class Book {

    protected String title;
    protected String author;
    protected int pages;
    protected boolean isAvailable;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        isAvailable = true;
    }
    // Basic methods
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }

    public String getTitle() { return title; }
    public String getAuthor(){ return author;}
    public int getPages(){ return pages;}

}
// Child class
class Textbook extends Book {
    private String subject;
    private int edition;

    public Textbook(String title, String author, int pages, String subject, int edition) {
        super(title, author, pages);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }
    public String getSubject(){
        return subject;
    }
    public int getEdition(){
        return edition;
    }
}

class Library {
    public static void main(String[] args) {

        Book book = new Book("Spark to Code", "Al Baraa", 220);
        Textbook textbook = new Textbook("IDK", "Al Baraa", 233, "Action", 1);
        book.borrowBook();
        book.returnBook();
        book.displayInfo();
        textbook.displayInfo();
    }
}