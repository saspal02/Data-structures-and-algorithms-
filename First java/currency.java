//6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Indian currency to convert in USD: ");
        float a = input.nextFloat();
        System.out.println(0.012*a +" is converted to USD");


    }
}