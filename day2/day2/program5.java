import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);

        System.out.println("Enter the number");
        int n= scnr.nextInt();

    int sum=0;

    while(n>0 )
    {
        int d=n%10;
        sum+=d;
        n/=10;
    }
    System.out.println("The sum of the digits is="+sum);

    scnr.close();
    
    }
    
}
