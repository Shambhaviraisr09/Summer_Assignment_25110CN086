
import java.util.Scanner;

public class program50 {
    public static void main( String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the length of array");
            int n= scnr.nextInt();

            int a[]= new int[n];

            for(int i=0; i<n; i++)
            {
                a[i]= scnr.nextInt();

            }


            int sum=0;
              for(int i=0; i<n; i++)
            {
                sum+=a[i];

            }

           double avg= sum/n;

           System.out.println("The sum of the array is "+sum+" and the average is "+avg);
            scnr.close();
    }
}
