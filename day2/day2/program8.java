import java.util.Scanner;

public class program8{
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
        int n= scnr.nextInt();

        int rev=0;
        int nn=n;

        while (nn>0)
        {
            int d=nn%10;
            rev =rev*10 + d;
            nn/=10;
        }

        if(n==rev)
            System.out.println("The number is PALLINDROME");
        else
            System.out.println("The number is NOT PALLINDROME");

        scnr.close();
    }
}
