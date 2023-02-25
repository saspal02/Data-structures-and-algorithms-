//4. Area of isosceles

import java.util.Scanner;

public class Areaofisosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the equal sides: ");
        double a = input.nextDouble();

        System.out.print("Enter the length of the base: ");
        double b = input.nextDouble();

        double area = (b*a)/2;

        System.out.println("The area of the isosceles triangle is: " + area);

        input.close();
    }
}
