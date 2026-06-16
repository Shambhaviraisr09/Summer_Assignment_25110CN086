import java.util.Scanner;

public class program57 {
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
              int j=n;
              for(int i=0; i<n; i++)
            {
                   a[i]=a[j];
                   j--;
            }

           for(int i=0; i<n;i++)
           {
            System.out.println(a[i]);
           }
           scnr.close();

}


}

