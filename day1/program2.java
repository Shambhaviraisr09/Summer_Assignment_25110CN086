import java.util.Scanner;

public class program2 {
    
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);

        System.out.println("Enter a number who's table is to be calculated");
        int n= scnr.nextInt();

        for(int i=1; i<11;i++)
        {
            int m=n*i;
            System.out.println(n+"*"+i+"="+m);
        }

        scnr.close();
        
    }
}
