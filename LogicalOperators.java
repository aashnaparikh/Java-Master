//LOGICAL OPERATORS

// AND : &&
// OR : ||
// NOT : !
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Welcome to ticket discount calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Are you a female? (True/False)");
        boolean gender = input.nextBoolean();

        if (age < 5){
            System.out.println("The Discount Rate is 75%");
        } else if (gender){
            System.out.println("You got a 50% discount");
        } else if (age > 60 && !gender) {
            System.out.println("You got a 25% discount");
        } else {
            System.out.println("No discount eligible");
        }
    }
}
