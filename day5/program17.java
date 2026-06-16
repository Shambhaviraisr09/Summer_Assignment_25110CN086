

import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n=scnr.nextInt();
                int s=0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                s=s+i;
            }

        if(s==n)
        System.out.println("The number is perfect number");
    else
        System.out.println("The number is not a perfect number");
    scnr.close();
    }
}
