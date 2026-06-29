import java.util.Scanner;

public class program101 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("**************************************************************************************");
        System.out.println("**************************************************************************************");
        System.out.println("\t \t \t \t <<<LETS PLAY THE GUESSING.>>>");
        System.out.println("**************************************************************************************");
        System.out.println("**************************************************************************************");
        System.out.println("In this game you have to guess the number I'm hiding.Good luck!!!!!!!!!!1");

        int n= 9845;

    

        for(int i=0; i<5; i++)
        {

                 System.out.println("Enter your guess");
                   int m= scnr.nextInt();
            if(n==m)
         {
               System.out.println("YAYYYYYYYYY!!!!!!!!!!! CONGRATULATIONSSSSSSSSSSSSSSS !!!!!!! YOUR GUESS IS ABSOLUTELY RIGHT");
                break;
         }
        else if(n>m)
          
          {
              System.out.println("OOPPPSS :[ THE GUESS IS SLIGHTLY OFF. ");
        System.out.println("Would u like a hint? \n Enter 1 for yes and 0 for no");
        int h= scnr.nextInt();

        if(h==1)
            System.out.println("Go for a higher number than before");
        else
            System.out.println("Okayyy. Try again buddy!!!");
        i++;

          }

          else
          {
              System.out.println("OOPPPSS :[ THE GUESS IS SLIGHTLY OFF. ");
        System.out.println("Would u like a hint? \n Enter 1 for yes and 0 for no");
        int h= scnr.nextInt();

        if(h==1)
            System.out.println("Go for a lower number than before");
        else
            System.out.println("Okayyy. Try again buddy!!!");
        i++;

          }
        }

        System.out.println("Thankyou for playing the game");
        scnr.close();

    }
    
}
