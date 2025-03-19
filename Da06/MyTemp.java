package Da06;
import java.util.Scanner;

public class MyTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String firstName = sc.next();

        int age = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.println("What is your age?");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid age (number).");
                sc.next(); // Consume the invalid input
            }
        }
        
        sc.nextLine(); // Consume the leftover newline
        
        System.out.println("What is your address?");
        String address = sc.nextLine();

        System.out.println("Hi " + firstName + ", you are a " + age + "-year-old person.");
        System.out.println("You live in " + address + ".");

       
        sc.close();
    }
}
