

import java.util.Scanner;

public class program20 {
    static boolean prime(int n)
    {
        int c=0;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
                c++;
        }

        if(c==0)
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();
            int max=0;
            for(int j=2; j<=n; j++)
            {
             
                if(n%j==0 && prime(j))
                {
                    if(j>max)
                        max=j;
                }
            }
            System.out.println("The largest prime factor is "+ max);

            scnr.close();
    }
}
