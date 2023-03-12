import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double circumference = calculateCircumference(radius);
        System.out.println("The circumference of the circle is " + circumference);

        double area = calculateArea(radius);
        System.out.println("The area of the circle is " + area);
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

}
