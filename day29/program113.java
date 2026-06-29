import java.util.Scanner;

public class program113 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println(" \t \t \t <<Welcome to your calculator>>");
        System.err.println("Make a choice on the basis of the operation required \n \n");

        System.out.println(" Enter 1 for addition \n Enter 2 for substraction \n Enter 3 for multiplication Enter 4 for division \n Enter 5 for modulus \n Enter 6 for to the power\n Enter 7 for factorial \n Enter 8 for EXIT \n");
System.out.println("******************************************************************************************************************** \n");
System.out.println("Enter your choice \n");
    int n= scnr.nextInt();
System.out.println("******************************************************************************************************************** \n");

switch (n)
{
    case 1:
        {
            System.out.println("Enter the number of elements who's sum is to be calculated");
            int m= scnr.nextInt();

            double a[]= new double[m];

            System.out.println("Enter the elements");
            double s=0.0;

            for(int i=0;i<m;i++)
            {
                a[i]= scnr.nextDouble();
            }

            for(int i=0;i<m;i++)
            {
               s+=a[i];
            }

            System.out.println("The output is "+s);
        }
        break;

         case 2:
        {
            System.out.println("Enter the two elements");
            double m= scnr.nextDouble();
            double o= scnr.nextDouble();

            double s= m-o;

            System.out.println("The output is "+s);
        }
        break;

         case 3:
        {
            System.out.println("Enter the number of elements which are to be multiplied");
            int m= scnr.nextInt();

            double a[]= new double[m];

            System.out.println("Enter the elements");
            double s=1.0;

            for(int i=0;i<m;i++)
            {
                a[i]= scnr.nextDouble();
            }

            for(int i=0;i<m;i++)
            {
               s*=a[i];
            }

            System.out.println("The output is "+s);
        }
        break;

         case 4:
        {
            System.out.println("Enter the number and the divisor");

             double m= scnr.nextDouble();
             double o= scnr.nextDouble();

            double s= m/o;

            

            System.out.println("The output is "+s);
        }
        break;
        
         case 5:
        {
            System.out.println("Enter the number and the divisor");

             double m= scnr.nextDouble();
             double o= scnr.nextDouble();

            double s= m%o;

            

            System.out.println("The output is "+s);
        }
        break;
        
         case 6:
        {
            System.out.println("Enter the number and the power");

             double m= scnr.nextDouble();
             double o= scnr.nextDouble();

            double s= Math.pow(m, o);            

            System.out.println("The output is "+s);
        }
        break;
        
         case 7:
        {
            System.out.println("Enter the number");

            double m= scnr.nextDouble();

            double s= 1.0;

            for(int i=1; i<=m;i++)
            {
                s*=i;
            }
            System.out.println("The output is "+s);
        }
        break;

        case 8:
            System.out.println("\t \t \t <<<EXIT THE PROGRAM. THANKYOU FOR THE CHOICE>>>");
            break;

        default:
            System.out.println("The choice made is invalid. Kindly try again");


}
            scnr.close();

    }
    
}
