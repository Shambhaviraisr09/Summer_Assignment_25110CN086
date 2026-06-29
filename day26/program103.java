import java.util.Scanner;

public class program103 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println(" \t \t \t <<Welcome to your ATM>>");
          int pin=1309;
          double amt=10000.0;

        System.out.println("First enter your four digit pin");

        for(int i=0; i<3;i++)
        {
              
        int p=scnr.nextInt();

        if(p==pin)
        {
        System.err.println("Make a choice on the basis of the operation required \n \n");

        System.out.println(" Enter 1 to Check Balance \n Enter 2 to Deposit Money \n Enter 3 to Withdraw Money \n Enter 4 to Exit \n");
       

    System.out.println("******************************************************************************************************************** \n");
    System.out.println("Enter your choice \n");
    int n= scnr.nextInt();
    System.out.println("******************************************************************************************************************** \n");

switch (n)
{
    case 2:
        {
            System.out.println("Enter the amount to be deposited");
            double m= scnr.nextDouble();

            amt+= m;
            System.out.println("The amount of rupees "+m+" has been credited.The new bank balance is "+amt);
        }
        break;

         case 3:
        {
            System.out.println("Enter the amount to be withdrawn");
            double m= scnr.nextDouble();

            if(amt>=m)
                System.out.println("The amount of rupees "+m+" has been succesfully debited.The new bank balance is "+(amt-m));
            else
                System.out.println("The balance is insufficient.");
        }
        break;

         case 1:
        {
            System.out.println("The current bank balance is "+amt);
            }
        break;

        
        case 4:
            System.out.println("\t \t \t <<<EXIT THE ATM. THANKYOU FOR THE CHOICE>>>");
            break;

        default:
            System.out.println("The choice made is invalid. Kindly try again");


}
break;
        }
        else
        {
            System.out.println("The pin is incorrect. You have two more tries left before your account is blocked. Try again!!!");
            i++;
        }

            scnr.close();

    }
}
}
