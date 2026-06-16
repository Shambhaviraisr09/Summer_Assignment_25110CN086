import java.util.Scanner;

 public class program15
{
    static int digits(int n)
                     {   int c=0;
                             while(n>0)
                                { 
                                     c++;
                                    n/=10;
                                 }
                             return c;
                     }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the number");
        int n=scnr.nextInt();

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
        System.out.println("The number is armstrong");
        else
         System.out.println("The number is not armstrong");

        scnr.close();
    }
}