import java.util.Scanner;
public class LastnameAct2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String userName, initial, lastName, month, day, numPeople, annSalary, gender, address;
        int year, age;

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

        age = 2021 - year;

        System.out.print("Welcome, ");
        if (gender.equals("male") | gender.equals("Male")){
            System.out.print("Mr. ");
        }
        else{
            System.out.print("Ms. ");
        }
        System.out.print(userName + " " + initial + " " + lastName + " to our system. Your birthdate is ");
        System.out.print(month + " " + day + ", " + year + ", and you are " + age + " years old, your gender is ");
        System.out.print(gender + " and you reside in " + address + "." + " The total number of people in your household is ");
        System.out.print(numPeople + " and your annual salary is Php " + annSalary + ".");
        myObj.close();
    }
}
