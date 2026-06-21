import java.util.Scanner;

public class program81
{
    public static void main(String args[])    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String s= scnr.nextLine();

            int count = 0;

                char a[] = s.toCharArray();

            for (int i=0; i < a.length; i++) 
                {
                    count++;
                 }

System.out.println("The length of the string is "+count);


scnr.close();
            
    }
}