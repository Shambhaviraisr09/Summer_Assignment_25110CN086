import java.util.Scanner;

public class program58{
    public static void main( String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the length of array");
            int n= scnr.nextInt();
        System.out.println("Enter the value of k");
            int k=scnr.nextInt();

            int a[]= new int[n];
            int b[]= new int[n];

            for(int i=0; i<n; i++)
            {
                a[i]= scnr.nextInt();

            }

              
              for(int i=k; i<n; i++)
            {
                   b[i]=a[i-k];

            }

          for(int i=0; i<k; i++)
        {
            b[i]=a[n-1-i];
        }
             

        for(int i=0; i<n; i++)
        {
            System.out.print(b[i]+" ");
        }
        scnr.close();
    }
}

