import java.util.Scanner;
public class program4 {

   public static void main(String[] args) {
    Scanner scnr= new Scanner(System.in);

    System.out.println("Enter a number");
        int n= scnr.nextInt();

            int c=0;
        while(n>0)
        {
            int d=n%10;
            c++;
            n/=10;
        }

        System.out.println("The number of digits is "+c);
   }
    
}
