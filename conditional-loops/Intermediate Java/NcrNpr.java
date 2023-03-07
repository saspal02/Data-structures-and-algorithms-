import java.util.Scanner;

public class NcrNpr {
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter value of r: ");
        int r = scanner.nextInt();
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);
        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);
    }
}
