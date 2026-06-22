import java.util.Scanner;

public class program77 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the size of matrix one");
        int r1= scnr.nextInt();
        int c1= scnr.nextInt();
        int a[][]= new int[r1][c1];

         System.out.println("Enter the size of matrix two");
        int r2= scnr.nextInt();
        int c2= scnr.nextInt();
        int b[][]= new int[r2][c2];

        System.out.println("Enter the elements of matrix one");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
                a[i][j]= scnr.nextInt();
        }

         System.out.println("Enter the elements of matrix two");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
                b[i][j]= scnr.nextInt();
        }

        if(c1==r2)
        {

                int c[][]= new int[r1][c2];

                for(int i=0;i<r1;i++)
                { 
                    for(int j=0;j<c2;j++)
                     {
                        for(int k = 0; k < c1; k++)
                            {
                                 c[i][j] += a[i][k] * b[k][j];
                             }

                }
            

                System.out.println("The multiplication of the two matrices is ");

                for(int k=0; k<r1;k++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        System.out.print(c[k][j]+" ");
                    }
                    System.out.println();
                }
        
            }
            scnr.close();

    }
    
}
}
