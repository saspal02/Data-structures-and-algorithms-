import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investmentAmount = sc.nextDouble();
        System.out.print("Enter the annual interest rate in percentage: ");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int numberOfYears = sc.nextInt();
        double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate / 100), numberOfYears);
        System.out.printf("Future investment value is %.2f", futureInvestmentValue);
        sc.close();
    }
}
