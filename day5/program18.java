

import java.util.Scanner;

public class program18 {
    static int factorial(int m)
    {
        int p=1;

        for(int i=1;i<=m;i++)
        {
            p*=i;
        }

        return p;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
        int n= scnr.nextInt();
            int m=n;
            int s=0;
        while(n>0)
        {
            int d=n%10;
            s=s+ factorial(d);
            n/=10;
        }

        if(s==m)
            System.out.println("The number is strong");
        else
            System.out.println("The number is not strong");
        
        scnr.close();


    }
}
