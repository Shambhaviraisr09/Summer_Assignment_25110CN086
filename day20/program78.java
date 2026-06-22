import java.util.Scanner;

public class program78 {
   public static void main(String[] args) {
    Scanner scnr= new Scanner(System.in);

    System.out.println("Enter the size of the array");
        int n= scnr.nextInt();
        int a[][]= new int[n][n];

        System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    a[i][j]= scnr.nextInt();
            }

            int t[][]= new int[n][n];

             for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    t[i][j]= a[j][i];
            }

            int c=0;
         for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                   if(a[i][j]!=t[i][j])
                   {
                    c++;
                    break;
                   }
            }

        if(c==0)
            System.out.println("The Matrix is symmetric");
        else
            System.out.println("The Matrix is not symmetric");

        scnr.close();

            
   } 
}
