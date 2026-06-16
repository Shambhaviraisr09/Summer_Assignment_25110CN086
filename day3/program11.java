

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);
        System.out.println("Enter the two numbers");

            int a= scnr.nextInt();
            int b= scnr.nextInt();
            int d=0;

            if (b>a)
            {
                d=a;
                a=b;
                b=d; 
            }
            while (b!=0)
            { 
                int c= a%b;
                a=b;
                b=c;
            }
            System.out.println("The gcd is="+ a);
            scnr.close();
            
    }
}
