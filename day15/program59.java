import java.util.Scanner;

public class program59 {
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

              
              for(int i=1; i<n; i++)
            {
                   a[i]=a[i-1];

            }

            a[0]=a[n-1];
             

        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
        scnr.close();
    }
}

