

import java.util.Scanner;

public class program21 {

    static int rev(int x)
    {
        int r=0;

        while(x>0)
        {
            int d=x%10;
            r=r*10+d;
            x/=10;
        }

        return r;
    }
  public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number is decimal");
            int n= scnr.nextInt();
            int m=0;
            while(n>0)
            {
                int d=n%2;
                m=m*10+d;
                n/=2;
            }

            m= rev(m);
System.out.println("The binary equivalent is "+ m);

scnr.close();

    }
}
