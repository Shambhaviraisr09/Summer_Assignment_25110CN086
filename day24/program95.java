import java.util.Scanner;

public class program95 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s= scnr.nextLine();

        String[] words = s.split(" ");
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
        scnr.close();
    }
}
