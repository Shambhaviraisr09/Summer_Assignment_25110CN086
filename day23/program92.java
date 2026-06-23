import java.util.Scanner;

public class program92
{
    static int freq(String s, char c)
     {
         int freq=0;
            for(int j=0;j<s.length();j++)
            {
                char d= s.charAt(j);

                if(d==c)
                    freq++;
            }

        return freq;
           
        }
        public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String p= scnr.nextLine();
      
           
              p = p.toLowerCase();
                char max='\0';
        for(int i=0; i<p.length();i++)
        {
            char d=p.charAt(i);
            int f= freq(p,d);

            if(f>max)
            {
                max=d;
            }
        }
     
            System.out.println("The maximum repeating character is " + max);
        
           
scnr.close();
            
    }
}

