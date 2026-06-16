
import java.util.Scanner;

public class program64 {
public static void main(String[] args) 
{
    Scanner scnr= new Scanner(System.in);
    System.out.println("Enter the size of the array");
        int n= scnr.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]= scnr.nextInt();

        }


        int b[]= new int[n];
        int k=0;
       

        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {

            if(a[i]==a[j])
            {
                c=1;
                break;

            } }

            if(c==0)
            {
                b[k]=a[i];
                k++;
            }

    
        }
        
            

        for(int i=0;i<k;i++)
        {
            System.out.print(b[i]+" ");
        }
scnr.close();

    
}
}
