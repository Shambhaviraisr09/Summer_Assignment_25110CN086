

import java.util.Scanner;

public class program26 {
    static int fibonacci(int x)
    
           {     if(x==0 || x==1)
                    return x;

                else
                    return fibonacci(x-1)+fibonacci(x-2);
           }

    public static void main(String[] args) 
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();

           
        System.out.println("The fibonacci term at place "+n+" is "+ fibonacci(n));
scnr.close();
    }
}
