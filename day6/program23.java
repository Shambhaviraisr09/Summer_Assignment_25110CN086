

import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
        int n=scnr.nextInt();
        int c=0;
        while(n>0)
        {
            int d=n%2;

            if(d==1)
            c++;

            n/=2;
        }

        System.out.println("Number of set bits is "+c);
    

scnr.close();
    }
}
