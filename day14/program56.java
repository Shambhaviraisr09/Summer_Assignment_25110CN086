import java.util.Scanner;

public class program56 {
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
               
              for(int i=0; i<n; i++)
            {
                   for(int j=0;j<n;j++)

                    if(a[i]==a[j] && i!=j)
                    {
                        System.out.println("The element "+ a[i] + " at the index "+ i+ " has a duplicate at the index "+j);
                    }

            }
 scnr.close();
    }
}

