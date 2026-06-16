import java.util.Scanner;

public class program61 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = scnr.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scnr.nextInt();
            sum += a[i];
        }

        
        int esum = (n + 1) * (n + 2) / 2;

        int m = esum- sum;

        System.out.println("Missing number is: " + m);

        scnr.close();
    }
}
