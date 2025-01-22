public class AssignmentOperators {
    public static void main(String[] args) {
       
        int myInt = 9; 
        // where the equal to sign is the assignment operator
        // the value 9 will be placed into the variable name myInt

        int newInt = myInt;
        // this will place the myInt value into the newInt 
        System.out.println(newInt); //this will print 9

        //You cannot write the following:
        //9 = myInt; 
        //this is because the equal to sign works different than in math, you cannot define a literal first
    }
}
