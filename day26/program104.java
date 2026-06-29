import java.util.Scanner;

public class program104 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int score = 0;

        System.out.println("\t \t \t <<< GENERAL KNOWLEDGE QUIZ >>>");

        
        System.out.println("\n1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Kolkata");
        System.out.println("d) Chennai");
        System.out.print("Your answer: ");
        char ans1 = scnr.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        
        System.out.println("\n2. Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Venus");
        System.out.println("c) Mars");
        System.out.println("d) Jupiter");
        System.out.print("Your answer: ");
        char ans2 = scnr.next().charAt(0);

        if (ans2 == 'c' || ans2 == 'C') {
            score++;
        }

        
        System.out.println("\n3. Who is known as the Father of the Nation in India?");
        System.out.println("a) Jawaharlal Nehru");
        System.out.println("b) Subhash Chandra Bose");
        System.out.println("c) B. R. Ambedkar");
        System.out.println("d) Mahatma Gandhi");
        System.out.print("Your answer: ");
        char ans3 = scnr.next().charAt(0);

        if (ans3 == 'd' || ans3 == 'D') {
            score++;
        }

        
        System.out.println("\n4. How many continents are there in the world?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.println("d) 8");
        System.out.print("Your answer: ");
        char ans4 = scnr.next().charAt(0);

        if (ans4 == 'c' || ans4 == 'C') {
            score++;
        }

        
        System.out.println("\n5. Which sport is associated with Wimbledon?");
        System.out.println("a) Cricket");
        System.out.println("b) Football");
        System.out.println("c) Tennis");
        System.out.println("d) Hockey");
        System.out.print("Your answer: ");
        char ans5 = scnr.next().charAt(0);

        if (ans5 == 'c' || ans5 == 'C') {
            score++;
        }

        
        System.out.println("\t \t \t <<<QUIZ RESULT >>>");
        System.out.println("Total Questions: 5");
        System.out.println("Correct Answers: " + score);
        System.out.println("Score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good job!");
        } else {
            System.out.println("Better luck next time!");
        }
        scnr.close();
    }
}