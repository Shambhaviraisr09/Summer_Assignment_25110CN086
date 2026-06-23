
import java.util.Scanner;

public class program91
{
     public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter two string");
            String p= scnr.nextLine();
            String q= scnr.nextLine();

            p = p.toLowerCase();
            q = q.toLowerCase();
    

        int flag=0;
             
if(p.length()==q.length())
{
    for(int i=0;i<p.length();i++)
    {
        char a=p.charAt(i);

            if(q.indexOf(a)==-1)
            {
                flag++;
                break;
            }
        
    }
}
if(flag==0)
    System.out.println("The strings are anagramic");
else
    System.out.println("the strings are not anagramic");
scnr.close();
            
    }
}
