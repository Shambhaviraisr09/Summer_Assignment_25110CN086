import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued = false;

    void addBook(Scanner scnr) {
        System.out.print("Enter Book ID: ");
        bookId = scnr.nextInt();
        

        System.out.print("Enter Book Title: ");
        title = scnr.nextLine();

        System.out.print("Enter Author Name: ");
        author = scnr.nextLine();

         isIssued = false;
        System.out.println("Book added successfully.");
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID     : " + bookId);
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Book Status : " + (isIssued ? "Issued" : "Available"));
    }
}

public class program109{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Book book = new Book();
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    book.addBook(scnr);
                    break;

                case 2:
                    book.issueBook();
                    break;

                case 3:
                    book.returnBook();
                    break;

                case 4:
                    book.displayBook();
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scnr.close();
    }
}
