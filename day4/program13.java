import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);
        System.out.println("Enter the limit");
            int n= scnr.nextInt();
        int a=0;
        int b=1;

        System.out.println(a+"\n"+b+" ");
        for(int i=1;i<n-2;i++)
        {
            int c= a+b;
                System.out.println(c+" ");
            a=b;
            b=c;
            
        }

        scnr.close();
    }
}
