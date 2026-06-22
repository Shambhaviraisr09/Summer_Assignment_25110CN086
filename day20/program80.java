import java.util.Scanner;

public class program80 {
   public static void main(String[] args) {
    Scanner scnr= new Scanner(System.in);

    System.out.println("Enter the size of the array");
        int n= scnr.nextInt();
        int m= scnr.nextInt();
        int a[][]= new int[n][m];

        System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    a[i][j]= scnr.nextInt();
            }


             for(int i=0;i<n;i++)
            {
                int sum=0;
                for(int j=0;j<m;j++)
                {
                    sum+= a[j][i];
                }
            System.out.println("The sum of column "+(i+1)+ " is "+sum);
            }

           
       
        scnr.close();

            
   } 
}