public class program40 {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) 
            {
            for (int s = 1; s <= rows - i; s++) 
                {
                System.out.print(" ");
                  }

            char ch = 'A';

            for (int j = 1; j <= i; j++) 
                {
                System.out.print(ch);
                ch++;
                }

                ch--;
            for (int j = 1; j < i; j++) 
                {
                ch--;
                System.out.print(ch);
                 }

            System.out.println();
        }
        
    }
}