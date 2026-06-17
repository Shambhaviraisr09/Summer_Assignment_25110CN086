
    import java.util.Scanner;

public class program68

{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the limit of two array");
        int m= scnr.nextInt();
        int n= scnr.nextInt();

        int a[]= new int[m];
        int b[]= new int[n];

        System.out.println("Enter the two arrays");

        for(int i=0;i<m;i++)
        {
            a[i]=scnr.nextInt();
        }


        
        for(int i=0;i<n;i++)
        {
            b[i]=scnr.nextInt();
        }

        

        System.out.println("The common elements are ");

        for(int i=0; i<m; i++)
        {

            int c=0;
            for(int j=0; j<n;j++)
          {

            if (a[i]==b[j])
                c++;

         }

         if(c>0)
            System.out.println(a[i]);
        }

scnr.close();
    }
}
