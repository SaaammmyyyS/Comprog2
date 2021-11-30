import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = "invalid grade";

        System.out.print("Enter a grade: ");
        double grade = input.nextDouble();

        if(grade <= 71){
            letter = "invalid grade";
        }
        else if (grade <= 75){
            letter = "D";
        }
        else if (grade <= 79){
            letter = "C";
        }
        else if (grade <= 83){
            letter = "C+";
        }
        else if (grade <= 87){
            letter = "B";
        }
        else if (grade <= 91){
            letter = "B+";
        }
        else if (grade <= 100){
            letter = "A";
        }

        System.out.println("The equivalent of " + grade + " is " + letter + ".");

        input.close();
    }
}
