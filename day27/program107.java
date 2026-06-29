import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    void inputDetails(Scanner scnr) {
        System.out.print("Enter Employee ID: ");
        empId = scnr.nextInt();
        scnr.nextLine(); 

        System.out.print("Enter Employee Name: ");
        name = scnr.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = scnr.nextDouble();
    }

    void calculateSalary() {
        hra = 0.20 * basicSalary; 
        da = 0.10 * basicSalary;  
        grossSalary = basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("\t \t \t <<< Salary Details >>>");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }
}

public class program107 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Employee emp = new Employee();
        int choice;

        do {
            System.out.println("\t \t \t<<< Salary Management System >>>");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Display Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    emp.inputDetails(scnr);
                    break;

                case 2:
                    emp.calculateSalary();
                    System.out.println("Salary calculated successfully.");
                    break;

                case 3:
                    emp.displayDetails();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scnr.close();
    }
}
