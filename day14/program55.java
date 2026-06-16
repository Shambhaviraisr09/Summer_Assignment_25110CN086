import java.util.Scanner;

public class program55 {
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
             
              for(int i=0; i<n; i++)
            {
                    if(a[i]>l)
                        l=a[i];

            }


            int sl=0;
            for(int i=0; i<n; i++)
            {
                if(sl>a[i] && sl!=l)
                    sl=a[i];
            }

            System.out.println("The second largest element is "+sl);
             scnr.close();
    }
}
