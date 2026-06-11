import java.util.Scanner;
public class program3 {
     public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number who's factorial is to be calculated");

        int n= scnr.nextInt();
    
int fac=1;

        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
        }

        System.out.println("The factorial of "+n+" is = "+fac);
    }
    
}
