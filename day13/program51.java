import java.util.Scanner;

public class program51 {
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
                int l=0;
                int s=a[0];
              for(int i=0; i<n; i++)
            {
                    if(a[i]>l)
                        l=a[i];

                    if(a[i]<s)
                        s=a[i];

            }

            System.out.println("The largest element is "+l+" and the smallest element is "+s);
             scnr.close();
    }
}
