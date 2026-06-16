import java.util.Scanner;

public class program42 {

    static int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter two numbers");

        int a= scnr.nextInt();
        int b= scnr.nextInt();

        System.out.println("The maximum between the two is "+max(a,b));
         scnr.close();
    }
    
}
