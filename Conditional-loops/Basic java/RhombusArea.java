//6.Area of rhombus
import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the diagonals: ");
        double diagonal1 = scanner.nextDouble();
        double diagonal2 = scanner.nextDouble();

        double area = (diagonal1 * diagonal2) / 2;

        System.out.println("The area of the rhombus is " + area);
    }
}

