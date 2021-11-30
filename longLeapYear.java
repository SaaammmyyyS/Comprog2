import java.util.Scanner;
public class longLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        boolean isLeap = true;
        int loop;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        
        if (isLeap == true){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }

        System.out.println("Do you want to enter another year? 1 - YES  2 - No: ");
        loop = sc.nextInt();
        if (loop == 1){
            year = sc.nextInt();
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    if ( year % 400 == 0)
                        isLeap = true;
                    else
                        isLeap = false;
                }
                else
                    isLeap = true;
            }
            else {
                isLeap = false;
            }
            if (isLeap == true){
                System.out.println(year + " is a leap year");
            }
            else{
                System.out.println(year + " is not a leap year");
            }
        }
        
        

        sc.close();
    }
}
