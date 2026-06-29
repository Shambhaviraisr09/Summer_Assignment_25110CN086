import java.util.Scanner;

public class program105{
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int max = 50;
        int count = 0;

        int[] roll = new int[max];
        String[] name = new String[max];
        int[] marks = new int[max];

        while (true) {
            System.out.println("\t \t \t <<< STUDENT RECORD MENU >>>");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scnr.nextInt();

            switch (choice) {

                case 1:
                    if (count < max) {
                        System.out.print("Enter roll number: ");
                        roll[count] = scnr.nextInt();

                       
                        System.out.print("Enter name: ");
                        name[count] = scnr.nextLine();

                        System.out.print("Enter marks: ");
                        marks[count] = scnr.nextInt();

                        count++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Record limit reached!");
                    }
                    break;

                case 2:
                   
                        System.out.println("\nRoll\tName\tMarks");
                        for (int i = 0; i < count; i++)
                         {
                            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
                        
                        }
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int r = scnr.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == r) {
                            System.out.println("Record Found:");
                            System.out.println("Roll: " + roll[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Student Record System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
        scnr.close();
    }
}