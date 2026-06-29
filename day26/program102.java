import java.util.Scanner;

public class program102 {
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);

        System.out.println("**************************************************************************************");
        System.out.println("**************************************************************************************");
        System.out.println("\t \t \t \t <<<LETS CHECK YOUR VOTING ELIGIBILITY.>>>");
        System.out.println("**************************************************************************************");
        System.out.println("**************************************************************************************");
        
                 System.out.println("Enter your age");
                   int m= scnr.nextInt();
            if(m>=18)
                System.out.println("Yes you're eligible to vote. Be a responsible citizen and cast your vote mindfully.");
         
           else
                System.out.println("Seems like you're still young and NOT ELIGIBLE TO VOTE");
            scnr.close();
}
}
     

