
import java.util.Scanner;
public class program76{
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the no of rows and columns of the matrix");
            int r= scnr.nextInt();
            int c= scnr.nextInt();

            int a[][]= new int[r][c];
                   

            System.out.println("Enter the elements of the matrix");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        a[i][j]= scnr.nextInt();
                    }
                }

            int sum1=0;
            int sum2=0;

                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        if(i==j)
                            sum1+=a[i][j];

                        if(i+j==r-1)
                            sum2+=a[i][j];
                    }
                }

             System.out.println("The sum of the left diagonal elements is "+sum1+" and the sum of the right diagonal elements is "+sum2);
               

            scnr.close();
            
    }
    
}
