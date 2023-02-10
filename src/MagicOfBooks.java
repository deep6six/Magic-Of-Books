import java.util.HashMap;

public class MagicOfBooks {
    private HashMap<String, Book> books;

    public MagicOfBooks() { books = new HashMap<>(); }

    public void addBook(Book book) { books.put(book.getBookID(), book); }

    public void showBooks()
    {
        System.out.println("Book List: ");
        for(String bookID : books.keySet())
        {
            Book book = books.get(bookID);
            System.out.println("bookID: " + bookID + " Book Title: " + book.getBookName());
        }
    }

    public Book getBookDetails(String bookID) { return books.get(bookID); }
}