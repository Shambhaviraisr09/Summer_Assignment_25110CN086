import java.util.Scanner;

public class program86
{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String s= scnr.nextLine();
        s=s.trim();

        int count=0;

            for(int i=0; i<s.length(); i++)
            {
                 char c= s.charAt(i);

                if(c==' ')
                    count++;
            }

        System.out.println("The number of words is "+(count+1));
           
scnr.close();
            
    }
}