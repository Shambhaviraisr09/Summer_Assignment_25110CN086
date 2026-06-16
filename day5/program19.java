import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
        int n= scnr.nextInt();

        for(int i=1; i<=n;i++)
        {
            if (n%i==0) 
                System.out.println(i+" is a factor of "+n);
        }

        scnr.close();
    }
    
}
