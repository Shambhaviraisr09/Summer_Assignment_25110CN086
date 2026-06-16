
import java.util.Scanner;
public class program41 {

    static int sum(int x,int y)
    {
        return x+y;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the two numbers who,s sum is to be found out");

        int a= scnr.nextInt();
        int b= scnr.nextInt();

        System.out.println("The sum of the two numbers is "+ sum(a,b));
 scnr.close();
    }
}
