import java.util.Scanner;

class Ticket {
    int totalSeats = 50;
    int bookedSeats = 0;
    int ticketPrice = 200;

    void showAvailability() {
        System.out.println("Total Seats   : " + totalSeats);
        System.out.println("Booked Seats  : " + bookedSeats);
        System.out.println("Available     : " + (totalSeats - bookedSeats));
    }

    void bookTicket(Scanner scnr) {
        int seats;
        System.out.print("Enter number of seats to book: ");
        seats = scnr.nextInt();

        if (seats > 0 && seats <= (totalSeats - bookedSeats)) {
            bookedSeats += seats;
            System.out.println("Ticket booked successfully.");
            System.out.println("Total Amount: Rs " + (seats * ticketPrice));
        } else {
            System.out.println("Seats not available.");
        }
    }

    void cancelTicket(Scanner scnr) {
        int seats;
        System.out.print("Enter number of seats to cancel: ");
        seats = scnr.nextInt();

        if (seats > 0 && seats <= bookedSeats) {
            bookedSeats -= seats;
            System.out.println("Ticket cancelled successfully.");
        } else {
            System.out.println("Invalid cancellation request.");
        }
    }
}

public class program111 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Ticket ticket = new Ticket();
        int choice;

        do {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    ticket.showAvailability();
                    break;

                case 2:
                    ticket.bookTicket(scnr);
                    break;

                case 3:
                    ticket.cancelTicket(scnr);
                    break;

                case 4:
                    System.out.println("Thank you for using Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scnr.close();
    }
}
