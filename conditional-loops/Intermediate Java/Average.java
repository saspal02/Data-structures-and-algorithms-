import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value #" + i + ": ");
            double value = input.nextDouble();
            sum += value;
        }
        double average = sum / n;
        System.out.println("The average is " + average);
        input.close();
    }
}





