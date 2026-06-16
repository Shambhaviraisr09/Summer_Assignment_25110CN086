

import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);

        System.out.println("Enter two numbers");

        int a= scnr.nextInt();
        int b= scnr.nextInt();

        int max= (a>b)?a:b;

        while(max%a!=0 || max%b!=0)
        {
            max++;
        }
        System.out.println("The lcm of the numbers is="+ max);
    scnr.close();
}
    
}
