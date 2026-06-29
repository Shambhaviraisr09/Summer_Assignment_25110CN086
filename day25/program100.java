import java.util.Scanner;

public class program100 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = scnr.nextLine();

        String[] words = s.split(" ");

        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        scnr.close();
    }
}
