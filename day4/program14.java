

import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the nth place");
        int n= scnr.nextInt();

        int a=0, b=1;
        int c=0;

        for(int i=1; i<n-2; i++)
        {
        c=a+b;
        a=b;
        b=c;
        }
        System.out.println("The number at "+ n+"th place is ="+c);
        scnr.close();
    }
}
