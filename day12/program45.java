import java.util.Scanner;

public class program45 {

   static int rev(int x)
   {
        int r=0;
    while(x>0)
    {
        int d= x%10;
        r=r*10+d;
        x/=10;
    }

    return r;
   }

   static boolean pall(int y)
   {
    if(y==rev(y))
        return true;
    else
        return false;
   }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();

            if(pall(n))
                System.out.println("The number is pallindome");
            else
                System.out.println("The number is not pallindrome");
             scnr.close();

    }
}
