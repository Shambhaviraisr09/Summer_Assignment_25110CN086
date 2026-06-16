
import java.util.Scanner;

public class program52 {
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


            int e=0;
            int o=0;
              for(int i=0; i<n; i++)
            {
        
                if(a[i]%2==0)
                    e+=a[i];
                else
                    o+=a[i];
            }

            System.out.println("The sum of even elemesnts is "+e+" and the sum of odd elements is "+o);
             scnr.close();
    }
}
