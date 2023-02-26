//9.Perimeter of equilateral triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the equilateral triangle: ");
        double sideLength = input.nextDouble();

        double perimeter = 3 * sideLength;

        System.out.println("Perimeter of the equilateral triangle is: " + perimeter);
    }
}
