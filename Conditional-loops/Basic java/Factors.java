import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to find factor: ");
        int number = input.nextInt();
        for( int i=1; i<=number; i++){

            if(number%i == 0)
                System.out.println(i + " ");

        }

    }
}
