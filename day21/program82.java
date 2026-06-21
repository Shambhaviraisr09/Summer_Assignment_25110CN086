import java.util.Scanner;

public class program82
{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String s= scnr.nextLine();
            String r="";

            for(int i=0; i<s.length(); i++)
            {
                char c= s.charAt(i);

                r=c+r;
            }

            System.out.println("The reverse string is "+r);

scnr.close();
            
    }
}