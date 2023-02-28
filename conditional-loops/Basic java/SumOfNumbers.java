import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter numbers (enter 0 to stop):");

        while ((num = input.nextInt()) != 0) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}

