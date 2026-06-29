import java.util.Scanner;

public class program115 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str = "";
        int choice;

        do {
            System.out.println("\t \t \t <<< Menu Driven String Operations >>>");
            System.out.println("1. Enter String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Check Palindrome");
            System.out.println("7. Count Vowels");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.print("Enter the string: ");
                    str = scnr.nextLine();
                    break;

                case 2:
                    System.out.println("Length of string: " + str.length());
                    break;

                case 3:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 5:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reversed String: " + rev);
                    break;

                case 6:
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reversed += str.charAt(i);
                    }

                    if (str.equalsIgnoreCase(reversed))
                        System.out.println("String is Palindrome");
                    else
                        System.out.println("String is Not Palindrome");
                    break;

                case 7:
                    int count = 0;
                    for (int i = 0; i < str.length(); i++) {
                        char ch = Character.toLowerCase(str.charAt(i));
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                            count++;
                    }
                    System.out.println("Number of vowels: " + count);
                    break;

                case 8:
                    System.out.println("Exiting String Operations System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);

        scnr.close();
    }
}
