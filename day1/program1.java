import java.util.Scanner;

public class program1 {
        public static void main(String args[])
    {
      Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a limit :");

            int n=scnr.nextInt();

            int s=0;

            for(int i=1; i<=n; i++)
            {
                s=s+i;
            }
            System.out.println("The sum of the first"+n+" natural numbers is = "+s);

            scnr.close();
            
    }


    
}
