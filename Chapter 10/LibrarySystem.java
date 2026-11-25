import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        Publisher publisher = new Publisher(1, "Open Books", "Dhaka", "01700000000");
        Book book = new Book(101, "Java Basics", "R. Hasan", 2024, 550.0, "AVAILABLE", publisher);
        User member = new User(7, "Asha", "Sylhet", "01800000000");
        Librarian librarian = new Librarian(3, "Nadia");
        librarian.addBook(book);
        librarian.addMember(member);
        librarian.displayBookDetails();
        librarian.orderBooks("Java");
        member.purchase(book);
        member.returnBook(book);
        member.payFine(25.0);
    }
}

final class Book {
    private final int id;
    private final String name;
    private final String author;
    private final int yearOfPublication;
    private final double price;
    private String status;
    private final Publisher publisher;

    Book(int id, String name, String author, int yearOfPublication, double price,
         String status, Publisher publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
        this.status = status;
        this.publisher = publisher;
    }

    int getId() { return id; }
    String getName() { return name; }
    String getStatus() { return status; }
    void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + author + " | " + yearOfPublication
                + " | " + price + " | " + status + " | " + publisher.getName();
    }
}

final class Librarian {
    private final int id;
    private final String name;
    private final List<Book> books = new ArrayList<>();
    private final List<User> members = new ArrayList<>();

    Librarian(int id, String name) { this.id = id; this.name = name; }
    void addBook(Book book) { books.add(book); }
    void addMember(User member) { members.add(member); }

    List<Book> searchBook(String name) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().toLowerCase().contains(name.toLowerCase())) result.add(book);
        }
        return result;
    }

    boolean verifyMember(int memberId) {
        for (User member : members) if (member.getId() == memberId) return true;
        return false;
    }

    void orderBooks(String title) {
        System.out.println("Search results for " + title + ": " + searchBook(title).size());
    }

    void displayBookDetails() {
        for (Book book : books) System.out.println(book);
    }
}

final class Publisher {
    private final int id;
    private String name;
    private String address;
    private String phoneNumber;

    Publisher(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    String getName() { return name; }
    void updateDetails(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

final class User {
    private final int id;
    private String name;
    private String address;
    private String phoneNumber;

    User(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    int getId() { return id; }
    void purchase(Book book) {
        if (!book.getStatus().equals("AVAILABLE")) throw new IllegalStateException("Book unavailable");
        book.setStatus("SOLD");
        System.out.println(name + " purchased " + book.getName());
    }
    void returnBook(Book book) {
        book.setStatus("AVAILABLE");
        System.out.println(name + " returned " + book.getName());
    }
    int payFine(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Fine cannot be negative");
        return (int) Math.round(amount);
    }
}
