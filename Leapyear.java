import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args){
        boolean pop = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        Leap ac1 = new Leap(year);

        System.out.println(ac1.eh());


        while (pop){
            System.out.println("Do you want to enter another year? 1 - YES  2 - No: ");
            Integer loop1 = sc.nextInt();
            if (loop1 == 1){
                System.out.println("Enter a year: ");
                year = sc.nextInt();
                ac1 = new Leap(year);
                System.out.println(ac1.eh());
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
