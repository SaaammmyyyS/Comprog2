import java.util.Scanner;
import java.text.MessageFormat;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
public class LastnameAct3 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String userName, initial, lastName, month, day, numPeople, annSalary, gender, address, title, email, contact, password, website;
        int year, age;
        boolean success1 = true, success2 = true, success3 = true;

        // *********************
        String re = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        System.out.println("Enter username: "); 
        userName = myObj.nextLine();

        System.out.println("Enter your middle initial: ");
        initial = myObj.nextLine();
        
        System.out.println("Enter your last name: ");
        lastName = myObj.nextLine();

        System.out.println("Enter your month: ");
        month = myObj.nextLine();
        
        System.out.println("Enter your day: ");
        day = myObj.nextLine();

        System.out.println("Enter your year: ");
        year = myObj.nextInt();

        System.out.println("Enter the number of people in your household: ");
        numPeople = myObj.nextLine();

        System.out.println("Enter your annual salary: ");
        annSalary = myObj.nextLine();

        System.out.println("Enter your gender: ");
        gender = myObj.nextLine();

        System.out.println("Enter your address: ");
        address = myObj.nextLine();

        System.out.println("Enter your contact: ");
        contact = myObj.nextLine();
        
        do{
            System.out.println("Enter your email: ");
            email = myObj.nextLine();
            if (email.contains("gmail.com") || email.contains("@yahoo.com") || email.contains("addu.edu.ph")){
                success1 = false;
            }
            else{
                success1 = true;
            }
        }while (success1);

        System.out.println("Enter your password: ");
        password = myObj.nextLine();
        while (success3){
            Pattern pt = Pattern.compile(re);
            Matcher mt = pt.matcher(password);
            boolean result = mt.matches();

            if (result == success3){
                success3 = false;
            }
            else {
                System.out.println("Enter your password: ");
                password = myObj.nextLine();
                success3 = true;
            }

        }


        // (must contain a valid URL ex. google.com.ph, facebook.com, en.wikipedia.org)

        do{
            System.out.println("Enter your website: ");
            website = myObj.nextLine();
            if (website.contains(".com") || website.contains(".org") || website.contains(".gov")){
                success2 = false;
            }
            else{
                success2 = true;
            }
        }while (success2);

        age = 2021 - year;

        if (gender.equals("male") | gender.equals("Male")){
            title = "Mr.";
        }
        else{
            title = "Ms.";
        }
        
        System.out.println(MessageFormat.format("Welcome, {0} {1} {2} {3} to our system. Your birthday is {4} {5}, {6} and you are {7} years old, your gender is {8} and you reside in {9}. The total number of people in your household is {10} and your annual salary is Php {11}",title, userName, initial, lastName, month, day, year, age, gender, address, numPeople, annSalary));
        System.out.println(MessageFormat.format(("For inquiries of his IT services, please contact him at {0} or send an email to {1}. You can also check his website at {3} User account: {1} {2}"), contact, email, password, website));
        
        myObj.close();
    }
}
