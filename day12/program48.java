import java.util.Scanner;

public class program48 {

    static boolean perfect(int x)
    {
       int s=0;

        for(int i=1; i<x;i++)
        {
            if(x%i==0)
                s+=i;
        }

        if(s==x)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();

            if(perfect(n))
            System.out.println("The number is a perfect number");
        else
            System.out.println("The number is not a perfect number");
         scnr.close();

    }
    
}
