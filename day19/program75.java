
import java.util.Scanner;
public class program75 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the no of rows and columns of the matrix");
            int r= scnr.nextInt();
            int c= scnr.nextInt();

            int a[][]= new int[r][c];
            int b[][]= new int[r][c];

          

            System.out.println("Enter the elements of the matrix");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        a[i][j]= scnr.nextInt();
                    }
                }

            

                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        b[i][j]=a[j][i];
                    }
                }

             System.out.println("The transpose of the matrix is ");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        System.out.print(b[i][j]+" ");
                    }
                  System.out.println();
                }

            scnr.close();
            
    }
    
}