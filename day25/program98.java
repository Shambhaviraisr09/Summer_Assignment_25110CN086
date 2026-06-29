import java.util.Scanner;

public class program98 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scnr.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scnr.nextLine();

        String common = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (s2.indexOf(ch) != -1 && common.indexOf(ch) == -1) {
                common = common + ch;
            }
        }

        if (common.length() > 0) {
            System.out.println("Common characters: " + common);
        } else {
            System.out.println("No common characters found.");
        }

        scnr.close();
    }
}