import java.util.Scanner;

public class program94 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scnr.nextLine();

        String compressed = "";
        int count;

        for (int i = 0; i < s.length(); i++) {
            count = 1;

            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }

            compressed = compressed + s.charAt(i) + count;
        }

        System.out.println("Compressed string: " + compressed);
        scnr.close();
    }
}