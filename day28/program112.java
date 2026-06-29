import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    void addContact(Scanner scnr) {
        scnr.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = scnr.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = scnr.nextLine();

        System.out.print("Enter Email ID: ");
        email = scnr.nextLine();

        System.out.println("Contact added successfully.");
    }

    void displayContact() {
        System.out.println("------------------------");
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
    }
}

public class program112 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Contact[] contacts = new Contact[5]; 
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    if (count < contacts.length) {
                        contacts[count] = new Contact();
                        contacts[count].addContact(scnr);
                        count++;
                    } else {
                        System.out.println("Contact list full.");
                    }
                    break;

                case 2:
                    
                    System.out.print("Enter name to search: ");
                    String searchName = scnr.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (contacts[i].name.equalsIgnoreCase(searchName)) {
                            contacts[i].displayContact();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Contact not found.");
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No contacts available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            contacts[i].displayContact();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Contact Management System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scnr.close();
    }
}
