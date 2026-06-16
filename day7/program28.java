

import java.util.Scanner;

public class program28 {
    int rev=0;

        static int reverse(int n, int rev) 
        {
        if (n == 0)
            return rev;

        return reverse(n / 10, rev * 10 + n % 10);
    }
    public static void main( String sargs[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();

            System.out.println("The reverse of "+n+" is "+ reverse(n,0));
            scnr.close();


    }
}
