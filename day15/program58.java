import java.util.Scanner;

public class program58 {
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
              
              for(int i=0; i<n-1; i++)
            {
                   a[i]=a[i+1];

            }
                a[n-1]=a[0];

        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
        scnr.close();
    }
}

