import java.util.Scanner;

public class program88
{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String s= scnr.nextLine();
            String n="";

            for(int i=0; i<s.length(); i++)
            {
                 char c= s.charAt(i);

                if(c!=' ')
                    r=r+c;
            }

        System.out.println("The new string without spaces is "+n);
           
scnr.close();
            
    }
}