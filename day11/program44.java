
import java.util.Scanner;

public class program44 {

    static int fac(int x)
    {
        int f=1;

        for(int i=1; i<=x; i++)
        {
            f*=i;
        }

        return f;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();


            System.out.println("The factorial of "+n+" is "+ fac(n));
             scnr.close();

    }
}
