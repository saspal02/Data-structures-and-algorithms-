//7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to begin fibonacci series: ");
        int fiblength = input.nextInt();
        int n1 = 0,n2 = 1,i;
        for( i=1 ; i<=fiblength ; ++i ){
            System.out.print(n1+ " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;

        }






    }
}