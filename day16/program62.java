


import java.util.Scanner;

public class program62 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
            int n= scnr.nextInt();
            int a[]= new int[n];

        System.out.println("Enter the array");
        
        for(int i=0; i<n;i++)
        {
            a[i]=scnr.nextInt();

        }
        int max=0;
        int z=0;

        for(int i=0; i<n;i++)
            {

                int b=0;
                
                for(int j=0; j<n; j++)
                {
                    if(a[i]==a[j])
                        b++;
                }

                if(b>max)
                   { max=b;
                    z=a[i];
                   }


            }
            System.out.println("The number with max frequency is "+z);
            scnr.close();

    }
    
}
