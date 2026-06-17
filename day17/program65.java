import java.util.Scanner;

public class program65 {
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the limits of the two arrays");

        int n= scnr.nextInt();
        int m= scnr.nextInt();

        int a[]= new int[m];
        int b[]= new int[n];

        System.out.println("Enter the elements of the arrays");

         for(int i=0;i<m;i++)
        {
            a[i]=scnr.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            b[i]=scnr.nextInt();
        }

        int d=m+n;
        int c[]= new int[d];

        int e=0;

        for(int i=0; i<m; i++ )
        {
            c[e]=a[i];
            e++;
        }

        for(int i=0;i<n;i++)
        {
            c[e]=b[i];
            e++;
        }

        System.out.println("The merged array is ");

        for(int i=0;i<e;i++)
        {
            System.out.println(c[i]);
        }

        scnr.close();
        
    }
    
}
