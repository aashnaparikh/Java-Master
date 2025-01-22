import java.util.Scanner;
public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner (System.in);
        int x1 = input.nextInt();
        //instead of writing:
        //a = a + x1
        //You can write:
        a += x1; //this will just add the value of x1 to a
        //this can be used for other operators:

        //LIST OF SHORTHAND OPERATORS:

        // -= : Subtraction assignment
        // *= : Multiplication assignment
        // /= : Division assignment
        // %= : Mod/Remainder assignment
    }
}
