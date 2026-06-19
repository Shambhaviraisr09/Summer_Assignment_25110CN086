
import java.util.Scanner;
public class program74 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the no of rows and columns of the matrices");
            int r= scnr.nextInt();
            int c= scnr.nextInt();

            int a[][]= new int[r][c];
            int b[][]= new int[r][c];

            int d[][]= new int[r][c];

            System.out.println("Enter the elements of the first matrix");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        a[i][j]= scnr.nextInt();
                    }
                }

             System.out.println("Enter the elements of the second matrix");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        b[i][j]= scnr.nextInt();
                    }
                }

                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        d[i][j]=a[i][j]-b[i][j];
                    }
                }

             System.out.println("The subtractive matrix is ");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        System.out.print(d[i][j]+" ");
                    }
                  System.out.println();
                }

            scnr.close();
            
    }
    
}