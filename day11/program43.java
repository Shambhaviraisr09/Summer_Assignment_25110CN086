
import java.util.Scanner;
public class program43 {

    static boolean prime(int x)
    {
        int c=0;
        for(int i=2; i<x;i++)
        {
            if(x%i==0)
                c++;
        }

        if(c>0)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
        int n= scnr.nextInt();

        if(prime(n))
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
 scnr.close();
    }
}
