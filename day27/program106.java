import java.util.Scanner;

public class program106 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int max = 50;
        int count = 0;

        int[] id = new int[max];
        String[] name = new String[max];
        double[] salary = new double[max];

        while (true) {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scnr.nextInt();

            switch (choice) {

                case 1:
                    if (count < max) {
                        System.out.print("Enter employee ID: ");
                        id[count] = scnr.nextInt();

                      
                        System.out.print("Enter employee name: ");
                        name[count] = scnr.nextLine();

                        System.out.print("Enter salary: ");
                        salary[count] = scnr.nextDouble();

                        count++;
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("Employee limit reached!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nID\tName\tSalary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(id[i] + "\t" + name[i] + "\t" + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = scnr.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            System.out.println("Employee Found:");
                            System.out.println("ID: " + id[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Employee Management System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scnr.close();
    }
}
