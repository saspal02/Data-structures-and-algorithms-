import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, negativeSum = 0, evenSum = 0, oddSum = 0;

        do {
            System.out.print("Enter a number (0 to quit): ");
            number = input.nextInt();

            if (number < 0) {
                negativeSum += number;
            } else if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

        } while (number != 0);

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + evenSum);
        System.out.println("Sum of positive odd numbers: " + oddSum);

        input.close();
    }
}
