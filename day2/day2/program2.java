
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

    System.out.println("Enter the number");
    int n= scnr.nextInt();
int rev=0;
    while (n>0)
    {
        int d=n%10;
        rev=rev*10 +d;
        n/=10;
    }

    System.out.println("The reverse of the number is="+rev);
    }
}
