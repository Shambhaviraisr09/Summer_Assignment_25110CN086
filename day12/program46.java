import java.util.Scanner;

public class program46 {

    static int digits(int x)
    {
        int d=0;

        while(x>0)
        {
           
            d++;
            x/=10;
        }
        return d;
    }

    static boolean armstrong(int y)
    {
        int s=y;
        double sum=0;

        while(s>0)
        {
            int d=s%10;
            sum=sum+ Math.pow(d,digits(y));
            s/=10;
        }
            int q= (int)sum;
        if(q==y)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a number");
            int n= scnr.nextInt();

            if(armstrong(n))
                System.out.println("The number is armstrong");
            else
                System.out.println("The number is not armstrong");
             scnr.close();

    }
}
