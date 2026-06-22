import java.util.Scanner;

public class program87
{
        public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String s= scnr.nextLine();
      

        for(int i=0; i<s.length();i++)
        {
            char c=s.charAt(i);
         int freq=0;
            for(int j=0;j<s.length();j++)
            {
                char d= s.charAt(j);
                if(d==c)
                    freq++;
            }
            System.out.println("The frequency of "+c+" is "+freq);
        }
scnr.close();
            
    }
}
