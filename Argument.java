public class Argument {
    public static void main(String[] args) {
        system.out.println(sumTwoNumbers(4,6));
        system.out.println(sumTwoNumbers(14,6));
        system.out.println(sumTwoNumbers(24,16));
    }

    public static int sumTwoNumbers(int first, int second) {
        System.out.println("First number received: "  + first);
        System.out.println("Second number received: "  + second);
        int sum = first + second;
        return sum;
        //you can also replace the last two lines and write return first+second;
    }
}
