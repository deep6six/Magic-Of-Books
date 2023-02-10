import java.util.*;

public class Main
{
    private static User verifyUser(String username, String password) {
        ArrayList<Book> newBooks = new ArrayList<>();
        ArrayList<Book> favorites = new ArrayList<>();
        ArrayList<Book> completed = new ArrayList<>();
        User user = new User(username, "123456789", "abc123@example.com",
                password, newBooks, favorites, completed);
        return user;
    }


    public static void main(String[] args)
    {
        //Scanner sc = new Scanner(System.in);

        MagicOfBooks magicOfBooks = new MagicOfBooks();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        User user = verifyUser(username, password);

        if (user != null) {
            int choice = 0;
            do {
                System.out.println("Main Menu");
                System.out.println("1. Show all books");
                System.out.println("2. Get book details");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        magicOfBooks.showBooks();
                        break;
                    case 2:
                        System.out.print("Enter the book ID: ");
                        String bookId = sc.nextLine();
                        Book book = magicOfBooks.getBookDetails(bookId);
                        if (book != null) {
                            System.out.println("Book Name: " + book.getBookName());
                            System.out.println("Author Name: " + book.getAuthorName());
                            System.out.println("Description: " + book.getDescription());
                        } else {
                            System.out.println("No book found with ID: " + bookId);
                        }
                        break;
                    case 3:
                        System.out.println("Exiting the program");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 3);
        } else {
            System.out.println("Invalid username or password");
        }

        sc.close();
    }
}