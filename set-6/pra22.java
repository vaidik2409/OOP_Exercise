import java.util.Scanner;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks = availableBooks - count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class pra22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library lib = new Library(3);

        try {
            System.out.println("Issuing 2 books...");
            lib.issueBook(2);

            System.out.println("\nIssuing 2 more books...");
            lib.issueBook(2);
        } 
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Library process completed");
        }
    }
}