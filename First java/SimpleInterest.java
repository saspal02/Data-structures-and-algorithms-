// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float principal = input.nextFloat();

        System.out.print("Enter the rate of interest: ");
        float rate = input.nextFloat();

        System.out.print("Enter the time period (in years): ");
        float time = input.nextFloat();

        System.out.println("Simple interest is "+ (principal*rate*time)/100);




    }
}