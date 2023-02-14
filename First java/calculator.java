// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = input.nextInt();

        System.out.print("Enter second number: ");
        float b = input.nextInt();


        System.out.println("Chosse your arithmetic operator");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println(a + b);
        } else if (operator == '-') {
            System.out.println(a - b);

        } else if (operator == '*') {
            System.out.println(a * b);

        } else if (operator == '/') {
            System.out.println(a / b);
        }

    }

}