import java.util.Scanner;

public class program71 {
    public static void main(String[] args) {
         Scanner scnr= new Scanner(System.in);

         System.out.print("Enter number of elements: ");
        int n = scnr.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) 
            {
            a[i] = scnr.nextInt();
             }
     System.out.println("Enter the element to be searched");
             int x= scnr.nextInt();

             int h=n-1;
             int l=0;
             int m=0;
             boolean flag=false;


             while(h>=l)
             {
                m=(h+l)/2;

                if(a[m]==x)
                {
                    flag =true;
                    break;
                }
                else if (a[m]>x) 
                    h=m-1;

                else
                    l=m+1;
                     
             }

             if(flag)
                System.out.println("The number was found at the index "+m);
            else
                System.out.println("Element not found");

scnr.close();

    }
    }

