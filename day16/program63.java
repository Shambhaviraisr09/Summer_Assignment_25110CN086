

import java.util.Scanner;

public class program63 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the size of the array");
            int n= scnr.nextInt();
            int a[]= new int[n];

            for(int i=0; i<n; i++)
            {
                a[i]=scnr.nextInt();
            }

            System.out.println("Enter the sum");
                int s= scnr.nextInt();

                for(int i=0; i<n;i++)
                {
                    for(int j=0; j<n;j++)
                    {
                        if((a[i]+a[j])==s)
                        {
                            System.out.println("The numbers are "+a[i]+" and "+a[j]);
                            break;
                        }

                    }
                }
                scnr.close();
    }
    
}
