//1.Area of circle

import java.util.Scanner;

    public class Areaofcircle {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter radius of the circle: ");

            float radius = input.nextFloat();

            float area = (float) (3.14 * radius * radius);
            System.out.println("The area of circle is "+ area);

        }
    }

