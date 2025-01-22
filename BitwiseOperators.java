//TYPES OF BITWISE OPERATORS

//AND (&): Logic gate AND
//OR (|) : Logic gate OR
//XOR Operator (^): XOR gate
//NOT Operator(~): NOT Gate (Bitwise Compliment)
//Left-Shift Operator(<<): Shifts left operand bits to the left filling the new rightmost bits with zero
//Right-Shift Operator(>>): Shift the left operands bits to the right. If positive, zero is filled in, if negative, ones are filled in
import java.util.Scanner;
public class BitwiseOperators {
    public static void main(String[] args) {

        //Ques One
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND");
        System.out.print("Enter A first number:");
        int num1 = input.nextInt();
        System.out.print("Enter A Second number:");
        int num2 = input.nextInt();

        int result = num1 & num2;
        System.out.println("Result is " + result);


        //Ques Two
        System.out.println("Showcasing Bitwise OR");
        System.out.print("Enter A first number:");
        int num1 = input.nextInt();
        System.out.print("Enter A Second number:");
        int num2 = input.nextInt();

        int result = num1 | num2;
        System.out.println("Result is " + result);


        //Ques Three
        System.out.println("Showcasing Bitwise XOR");
        System.out.print("Enter A first number:");
        int num1 = input.nextInt();
        System.out.print("Enter A Second number:");
        int num2 = input.nextInt();

        int result = num1 ^ num2;
        System.out.println("Result is " + result);


        //Ques Four
        System.out.println("Showcasing Bitwise Lefthand Operator");
        System.out.print("Enter A first number:");
        int num1 = input.nextInt();

        int result = num1 << 1;
        System.out.println("Result is " + result);


        //Ques Five
        System.out.println("Showcasing Bitwise Righthand Operator");
        System.out.print("Enter A first number:");
        int num1 = input.nextInt();

        int result = num1 >> 1;
        System.out.println("Result is " + result);


        //Ques Six
        //Checking if a number is even or odd using BITWISE
        System.err.println("Checking if a number is even/odd using Bitwise");
        System.out.print("Enter a number:");
        int num1 = input.nextInt();

        if ((num1 & 1) == 1 ) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("Your number is even");
        }
    }
}
