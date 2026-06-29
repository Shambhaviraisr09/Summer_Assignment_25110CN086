import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    void addProduct(Scanner scnr) {
        System.out.print("Enter Product ID: ");
        productId = scnr.nextInt();
        scnr.nextLine(); // consume newline

        System.out.print("Enter Product Name: ");
        productName = scnr.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = scnr.nextInt();

        System.out.print("Enter Price: ");
        price = scnr.nextDouble();

        System.out.println("Product added successfully.");
    }

    void updateStock(Scanner scnr) {
        System.out.println("1. Add Stock");
        System.out.println("2. Remove Stock");
        System.out.print("Choose option: ");
        int option = scnr.nextInt();

        System.out.print("Enter quantity: ");
        int qty = scnr.nextInt();

        if (option == 1) {
            quantity += qty;
            System.out.println("Stock added successfully.");
        } else if (option == 2) {
            if (qty <= quantity) {
                quantity -= qty;
                System.out.println("Stock removed successfully.");
            } else {
                System.out.println("Insufficient stock.");
            }
        } else {
            System.out.println("Invalid option.");
        }
    }

    void displayProduct() {
        System.out.println("----------------------------");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Price        : " + price);
    }
}

public class program116 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Product[] products = new Product[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\t \t \t<<< Inventory Management System >>>");
            System.out.println("1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    if (count < products.length) {
                        products[count] = new Product();
                        products[count].addProduct(scnr);
                        count++;
                    } else {
                        System.out.println("Inventory is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No products available.");
                        break;
                    }

                    System.out.print("Enter Product ID to update: ");
                    int id = scnr.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (products[i].productId == id) {
                            products[i].updateStock(scnr);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product not found.");
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No products in inventory.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            products[i].displayProduct();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scnr.close();
    }
}
