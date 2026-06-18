import java.util.Scanner;

public class program70 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

         System.out.print("Enter number of elements: ");
        int n = scnr.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) 
            {
            a[i] = scnr.nextInt();
             }

      
        for (int i = 0; i < n - 1; i++) 
            {
                 int m = i;

            for (int j = i + 1; j < n; j++) 
                {
                     if (a[j] < a[m])
                            m = j;
                }

            int temp = a[m];
            a[m] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
            {
            System.out.print(a[i] + " ");
              }

        scnr.close();
    }
}
