import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in); //decleration of input 
        System.out.print("Please enter your name: "); // this will print the statement and allow the user to enter input
        //NOTE: println wasnt used so the input is on the same line
        String name = input.nextLine(); //this will pick up the input value enter and store it in a string called name
        System.out.println("Good Morning "+ name);
    }
}