

import java.util.Scanner;

public class program27 {
    static int sum(int x)
        {
            int d= x%10;

            if(x>0)
                return d+ sum(x/10);
            else
                return 0;
        }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();

            System.out.println("The sum of the digits of "+n+" is "+ sum(n));
            scnr.close();
    }
}
