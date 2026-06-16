

import java.util.Scanner;

public class program16 {
    static int digits(int n)
                     {   int c=0;
                             while(n>0)
                                { 
                                     c++;
                                    n/=10;
                                 }
                             return c;
                     }


            static boolean armstrong(int n)
            {
                 int m=n;
        double w=0;
        while(m>0)
        {
            int e=m%10;
                w=w+ Math.pow(e, digits(n));
                m/=10;
        }

        w=(int)w;

        if(n==w)
         return true;
        else
         return false;
            }

    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);

        System.out.println("Enter a range");
            int n= scnr.nextInt();

            for(int i=1; i<=n;i++)
            {
               if (armstrong(i))
                System.out.println(i+" is an armstrong number");
            else
                System.out.println(i+" is not an armstrong number");
            }
            scnr.close();
    }
    
}
