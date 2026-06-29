import java.util.Scanner;

public class program99 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = scnr.nextInt();
        sc.nextLine();   

        String[] names = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = scnr.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in alphabetical order:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        scnr.close();
    }
}
