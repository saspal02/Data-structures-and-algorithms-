// 9. To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();

        for (int i = lowerBound; i <= upperBound; i++) {
            int n = i, sum = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                sum += lastDigit * lastDigit * lastDigit;
                n /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
}