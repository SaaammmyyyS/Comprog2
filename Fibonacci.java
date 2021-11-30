import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        
  
        int n, firstTerm = 0, secondTerm = 1, tries = 0;
        boolean bool = true;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter Fibonacci index: ");
            n = input.nextInt();
            if (n > 0 && n < 40){
                for (int i = 1; i <= n; ++i) {
                    if (i == n){
                        System.out.println(firstTerm);
                    }
                    else{
                        System.out.print(firstTerm + ", ");
                    }
                    // compute the next term
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
                bool = false;
            }
            else{
                System.out.println("Invalid input");
                tries++;
                if (tries == 3){
                    System.out.println("Sorry. You already reached the maximum number of tries.");
                    System.exit(0);
                }
            }

        } while (bool);
        input.close();
        

    }
}