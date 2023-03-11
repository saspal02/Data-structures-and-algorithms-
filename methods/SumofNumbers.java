import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Enter the second number: ");
        int second = input.nextInt();

        SumNumbers(first,second);

    }

    public static void SumNumbers(int first, int second) {
       int Sum = first + second;
        System.out.println("The sum is" + Sum);
    }
}
