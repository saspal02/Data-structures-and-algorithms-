// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();

        if (a > b) {
            System.out.println(a + " is greater");
        } else if (b > a) {
            System.out.println(b + " is greater ");

        }

    }
}