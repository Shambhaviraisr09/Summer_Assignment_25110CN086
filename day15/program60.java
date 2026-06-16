import java.util.Scanner;

public class program60 {
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
              
            int b[]= new int[n];
            int c=0;
            int d=n-1;
              for(int i=0; i<n; i++)
            {
                  if(a[i]==0)
                     {   
                        b[d]=a[i];
                        d--;
                    }

                    else
                    { 
                        b[c]=a[i];
                        c++;                  
                    }
            }
               

        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
        scnr.close();
    }
}

