/*Method Syntax
modifier returntype methodname(parameter1,parameter2){
body
}
example:
 * public int addition ( int operand1, int operand2){
 * int sum;
 * sum = operant1+operand2;
 * return sum;}
 */

public class Method{
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows)  {
                System.out.print("  *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}

