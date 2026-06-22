import java.util.Scanner;

public class program85
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
            if(s.equalsIgnoreCase(r))
            System.out.println("The string is pallindrome");
        else
            System.out.println("The string is  not pallindrome");

scnr.close();
            
    }
}