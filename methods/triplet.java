import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(isPythagoreanTriplet(num1, num2, num3)) {
            System.out.println("The given triplet is a Pythagorean triplet");
        } else {
            System.out.println("The given triplet is not a Pythagorean triplet");
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int sumOfSquares = (a*a) + (b*b);
        int squareOfThird = c*c;
        if(sumOfSquares == squareOfThird) {
            return true;
        }
        return false;
    }
}
