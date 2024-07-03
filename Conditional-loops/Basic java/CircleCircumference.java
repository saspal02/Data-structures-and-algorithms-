//8. Perimeter of circle

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is " + circumference);
    }
}
