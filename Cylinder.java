import java.util.Scanner;
import java.lang.Math;
public class Cylinder {

    public static void main(String[] args) {
        double pi = 3.14159;

        Scanner input = new Scanner(System.in);

        // Cylinder

        System.out.println("Cylinder");
        System.out.println("Enter the raduis: ");
        double radius1 = input.nextDouble();

        System.out.println("Enter the height: ");
        double height1 = input.nextDouble();

        double CYarea = ((2) * (pi) * (radius1) * (height1)) + ((2) * (pi) * (radius1 * radius1));


        System.out.println();

        // Cone

        System.out.println("Cone");
        System.out.println("Enter the raduis: ");
        double radius2 = input.nextDouble();

        System.out.println("Enter the height: ");
        double height2 = input.nextDouble();

        double Carea = ((pi) * (radius2)) * (radius2 + (Math.sqrt((height2 * height2) + (radius2 * radius2))));


        System.out.print("The area of the cylinder is ");
        System.out.printf("%.2f", CYarea);
        System.out.print(" and the area of the cone is ");
        System.out.printf("%.2f", Carea);
        System.out.print(".");

        input.close();

    }
}
