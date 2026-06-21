import java.util.Scanner;

public class program84
{
    public static void main(String args[])
    {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter a string");
            String s= scnr.nextLine();
           String n= s.toUpperCase();
            System.out.println("The new string is "+n);

scnr.close();
            
    }
}