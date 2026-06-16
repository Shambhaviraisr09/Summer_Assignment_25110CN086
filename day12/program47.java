import java.util.Scanner;

public class program47 {

    static int fibonacci(int x)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=3;i<=x;i++)
        {
         c=a+b;
            
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the limit");
            int n= scnr.nextInt();

            System.out.println("The fibonacci number at place "+n+" is "+fibonacci(n));
             scnr.close();
    }

    }
