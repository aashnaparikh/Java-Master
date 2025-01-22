//RELATIONAL OPERATORS
//Takes two numbers and checks its boolean value

//TYPES OF OPERATORS:

//Equality Operators:
// == "checks value equality" ; === "Checks value and type equality"

//Inequality Operators:
//!= "Checks value inequality" ; "!==" "Checks value and type inequality"

//Relational 
// > "Greater than" ; < "Lesser than" ; ">=" Greater than or equal to ; 
// <= "Less than or equal too"

import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");

        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for driving");
        } else {
            System.out.println("You are not elegible for driving");
        }
    }
}
