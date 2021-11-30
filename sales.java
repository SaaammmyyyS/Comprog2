import java.util.Scanner;
public class sales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating Sales Program");
        
        double[] nums =  new double[3];
        double[] quantities = new double[3];

        // input 
        for (int i = 0; i < 3; i++){
            System.out.println("Enter product number: ");
            nums[i] = sc.nextInt();
            System.out.println("Enter quantity sold: ");
            quantities[i] = sc.nextDouble();
        }
        
        // convert nums to prices
        for (int i = 0; i < 3; i++){
            if (nums[i] == 1){
                nums[i] = 2.98;
            }
            else if (nums[i] == 2){
                nums[i] = 4.50;
            }
            else if (nums[i] == 3){
                nums[i] = 9.98;
            }
            else if (nums[i] == 4){
                nums[i] = 4.49;
            }
            else if (nums[i] == 5){
                nums[i] = 6.87;
            }
        }
        

        // Multiply the prices to the qualities
        for (int i = 0; i < 3; i++){
            nums[i] = nums[i] * quantities[i];
        }

    
        double sum = nums[0] + nums[1] + nums[2];
        System.out.print("Total sales is $ ");
        System.out.printf("%,.2f", sum);

        sc.close();
    }
}
