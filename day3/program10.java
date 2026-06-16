

import java.util.Scanner;

public class program10 {
    static boolean isprime(int q)
                     {
                         int c=0;
                             for(int i=2;i<q;i++)
                                 {
                                     if(q%i==0)
                                     c ++;
                                 }
                          if(c==0)
                            return true;
                         else
                             return false;
                     }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the range limit");

        int n=scnr.nextInt();

        for(int j=2; j<=n; j++)
        {
            if(isprime(j))
                System.out.println("The number "+ j+ " is prime");  
            else
                 System.out.println("The number "+ j+ " is not prime");          
        }
        scnr.close();
    }
}
