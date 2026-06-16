import java.util.Scanner;

public class program25 {
    static int factorial(int x)
            {
                if(x==0 || x==1)
                    return 1;

                else
                    return x*factorial(x-1);
            }

    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();

           
        System.out.println("The factorial of "+n+" is "+ factorial(n));
scnr.close();
    }
}
