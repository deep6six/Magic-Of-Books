import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class User
{
    Scanner sc = new Scanner(System.in);
    String userName;
    String emailID;
    String password;
    String userID = UUID.randomUUID().toString();
    ArrayList<Book> newBooks = new ArrayList<>();
    ArrayList<Book> completedBooks = new ArrayList<>();
    ArrayList<Book> favorites = new ArrayList<>();

    public User()
    {
//        System.out.println("Register new user\n");
//        System.out.println("Enter email: "); this.emailID = sc.nextLine();
//        System.out.println("Enter userName: "); this.userName = sc.nextLine();
//        System.out.println("Enter password: "); this.password = sc.nextLine();
    }

    public User(String userName, String userID, String emailID, String password, ArrayList<Book> newBooks,
                ArrayList<Book> favorites, ArrayList<Book> completedBooks)
    {
        this.userName = userName;
        this.userID = userID;
        this.emailID = emailID;
        this.password = password;
        this.newBooks = newBooks;
        this.favorites = favorites;
        this.completedBooks = completedBooks;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public ArrayList<Book> getNewBooks() {
        return newBooks;
    }

    public void setNewBooks(ArrayList<Book> newBooks) {
        this.newBooks = newBooks;
    }

    public ArrayList<Book> getCompletedBooks() {
        return completedBooks;
    }

    public void setCompletedBooks(ArrayList<Book> completedBooks) {
        this.completedBooks = completedBooks;
    }

    public ArrayList<Book> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Book> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "User{" +
                "sc=" + sc +
                ", userName='" + userName + '\'' +
                ", emailID='" + emailID + '\'' +
                ", password='" + password + '\'' +
                ", userID='" + userID + '\'' +
                ", newBooks=" + newBooks +
                ", completedBooks=" + completedBooks +
                ", favorites=" + favorites +
                '}';
    }
}
