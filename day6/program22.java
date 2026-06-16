
import java.util.Scanner;

public class program22 {
    public static void main( String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number is binary");
        int n= scnr.nextInt();

        int p=0;
        double m=0;

        while(n>0)
        {
            int d=n%10;
            double x= Math.pow(2,p);
            m=m+ d*x;
            p++;
            n/=10;
        }

        int z=(int)m;

        System.out.println("The decimal equivalent is "+z);
scnr.close();
    }
}
