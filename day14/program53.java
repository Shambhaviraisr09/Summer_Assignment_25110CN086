import java.util.Scanner;

public class program53 {
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

            System.out.println("Enter the number to be searched");
                int x= scnr.nextInt();

                int b=-1;
              for(int i=0; i<n; i++)
            {
                if(a[i]==x)
                   { b=i;
                    break;
                   }
            }

            if(b>-1)
                System.out.println("The number is present at the index "+b);
            else
                System.out.println("The number is not present :(");
            scnr.close();
    }
}

