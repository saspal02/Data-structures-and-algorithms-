import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        int lcm = (number1 > number2) ? number1 : number2;
        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                System.out.printf("The LCM of %d and %d is %d", number1, number2, lcm);
                break;
            }
            lcm++;
        }
        sc.close();
    }
}

