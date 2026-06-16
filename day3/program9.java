

import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
        int n= scnr.nextInt();
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                count ++;
            
        }
        if(count>0)
            System.out.println("The number is not prime");
        else
         System.out.println("The number is prime");    
        scnr.close();
    }
}
