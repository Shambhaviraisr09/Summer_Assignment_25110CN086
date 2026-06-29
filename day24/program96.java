import java.util.Scanner;

public class program96 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scnr.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check if character already exists in result
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);

        scnr.close();
    }
}
