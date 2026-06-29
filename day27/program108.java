import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];
    int total;
    double percentage;
    char grade;

    void inputDetails(Scanner scnr) {
        System.out.print("Enter Roll Number: ");
        rollNo = scnr.nextInt();
       

        System.out.print("Enter Student Name: ");
        name = scnr.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scnr.nextInt();
        }
    }

    void calculateResult() {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        percentage = total / 5.0;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayMarksheet() {
        System.out.println("\n-------- MARKSHEET --------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);

        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);

        if (grade != 'F')
            System.out.println("Result      : PASS");
        else
            System.out.println("Result      : FAIL");
    }
}

public class program108 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Student st = new Student();

        st.inputDetails(scnr);
        st.calculateResult();
        st.displayMarksheet();

        scnr.close();
    }
}
