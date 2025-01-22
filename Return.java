public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum is: " + sum);
    }

    public static void greet() {
        System.out.println("Welcome to the calculator");
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        return number;
    }
}
