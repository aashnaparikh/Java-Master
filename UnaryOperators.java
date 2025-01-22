//Unary Operators are INCREMENTAL Operators

public class UnaryOperators {
    public static void main(String[] args) {
        
        //Operator one: -
        //Convert a positive value to negative value

        int x = 5;
        int y = -x;
        System.out.println(y); //this will print "-5"

        //Operator two: ++
        //Pre-increment
        //Increment the value by 1 and then uses it in the statement

        int a = 5;
        System.out.println(++a); // this will output "6"
        System.out.println(a); // this will also output "6"

        //Operator three: ++
        //Post-increment
        //Use the value first and then increment by 1

        int p = 6;
        System.out.println(p++); // this will output "6" or remain the same
        System.out.println(p); //this will print out 7

        //The same principle works for PRE AND POST DECREMENT
    }
}
