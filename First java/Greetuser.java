// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greetuser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name + ", welcome to the world of Java programming!");
    }
}


