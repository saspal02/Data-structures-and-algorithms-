// 10. PerimeterOfParallelogram

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of one side of the parallelogram: ");
        double sideLength = input.nextDouble();

        System.out.print("Enter the length of an adjacent side of the parallelogram: ");
        double adjacentSideLength = input.nextDouble();

        double perimeter = 2 * (sideLength + adjacentSideLength);

        System.out.println("Perimeter of the parallelogram is: " + perimeter);
    }
}
