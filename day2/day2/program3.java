import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= scnr.nextInt();

        int p=1;

        while(n>0)
        {
            int d=n%10;
            p*=d;
            n/=10;
        }
        System.out.println("The product of the digits is="+ p);
    }
}
