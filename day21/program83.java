import java.util.Scanner;

public class program83
{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String s= scnr.nextLine();
        int v=0;
        int c=0;

            for(int i=0; i<s.length(); i++)
            {
                char d= s.charAt(i);


            if("aeiouAEIOU".indexOf(d)==-1)
                c++;
            else
                v++;
            }

            System.out.println("The number of vowels is "+v+" and the number of consonants is "+c);

scnr.close();
            
    }
}