import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;

        System.out.println("Enter numbers (enter 0 to stop):");

        while ((num = input.nextInt()) != 0) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number: " + max);
    }
}

