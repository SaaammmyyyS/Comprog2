import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the raduis (in cm): ");
        double raduis = input.nextDouble();

        double diameter = raduis * 2;
        System.out.println("The diameter is " + diameter + " cm");

        double circ = (2) * (pi) * (raduis);
        System.out.println("The circumference is " + circ + " cm");

        double area = (pi) * (raduis * raduis);
        System.out.println("The area is " + area + " cm^2");

        input.close();

    }
}
