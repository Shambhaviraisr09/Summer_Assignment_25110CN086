import java.util.Scanner;

public class program93 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scnr.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scnr.nextLine();

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Yes, the string is a rotation.");
        } else {
            System.out.println("No, the string is not a rotation.");
        }
        scnr.close();
    }
}
