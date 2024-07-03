//5. Area of parallelogram
    import java.util.Scanner;

    public class Areaofparallelogram {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the base length of the parallelogram: ");
            double base = scanner.nextDouble();

            System.out.print("Enter the height of the parallelogram: ");
            double height = scanner.nextDouble();

            double area = base * height;

            System.out.println("The area of the parallelogram is: " + area);
        }
    }


