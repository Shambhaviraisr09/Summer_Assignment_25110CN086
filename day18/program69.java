
import java.util.Scanner;
public class program69 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the size of the array");
            int n= scnr.nextInt();
            int a[]= new int[n];

            System.out.println("Enter the elements of the array");

            for(int i=0; i<n;i++)
            {
                a[i]=scnr.nextInt();
            }

            for (int i = 0; i < n - 1; i++)
                 {
                         int flag = 0;   

                            for (int j = 0; j < n - i - 1; j++) 
                                {
                                     if (a[j] > a[j + 1]) 
                                        {
                                             int temp = a[j];
                                                  a[j] = a[j + 1];
                                                  a[j + 1] = temp;
                                              flag = 1;   
                                          }
                                 }
            if (flag == 0) {
                break;
            }
        }

        System.out.println("The sorted array is ");

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        scnr.close();
    }
}
