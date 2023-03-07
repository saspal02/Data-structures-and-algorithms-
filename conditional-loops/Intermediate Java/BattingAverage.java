import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of runs scored: ");
        double runs = input.nextDouble();
        System.out.print("Enter the number of times the batter was out: ");
        double outs = input.nextDouble();
        double average = runs / outs;
        System.out.println("Batting average is: " + average);
    }
}
