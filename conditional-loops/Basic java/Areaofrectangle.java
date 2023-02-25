//3. Area of rectangle

import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the breadth: ");
        float breadth = input.nextFloat();
        System.out.println("Enter the length: ");
        float length = input.nextFloat();

        System.out.println("The area of rectangle is "+ length * breadth);

    }

}
