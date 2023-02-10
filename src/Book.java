import java.util.UUID;

public class Book
{
    String bookName;
    String authorName;
    String description;
    String bookID = UUID.randomUUID().toString();

    public Book(String bookName) {}

    public Book(String bookName, String authorName, String description, String bookID) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.description = description;
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
}
