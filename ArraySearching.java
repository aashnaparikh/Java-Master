import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 9, 17, 21, 34, 80};
        System.out.println("Welcome to array searching\n");
        System.out.println("Enter a number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Your number in the array was found");
        } else {
            System.out.println("Your number in the array was not found");
        }
    }

    public static boolean isFound(int[] arr, int num){
        int index=0;
        while (index < arr.length){
           if (arr[index] == num){
            return true;
           }
            index++;
        }
        return false;
    }
}
