

import java.util.Scanner;

public class program24 {
     public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);

        System.out.println("Enter a number and the power");
        int x= scnr.nextInt();
        int n=scnr.nextInt();

        int a=1;

        for(int i=1; i<=n; i++)
        {
            a*=x;
        }

        System.out.println(x+" to the power "+n+" is "+a);

        scnr.close();
    }
    
}
