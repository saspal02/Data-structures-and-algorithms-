import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        // Get the interest rate
        System.out.print("Enter the interest rate: ");
        double rate = input.nextDouble();

        // Get the time period in years
        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble();

        // Calculate the compound interest
        double amount = principal * Math.pow(1 + (rate / 100), time);

        // Display the result
        System.out.println("Compound Interest: " + (amount - principal));
    }
}
