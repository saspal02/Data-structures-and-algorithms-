//7.Area of equilateral triangle

import java.util.Scanner;

public class EquilateralTriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the equilateral triangle: ");
        double sideLength = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * sideLength * sideLength;

        System.out.println("The area of the equilateral triangle is: " + area);
    }
}
