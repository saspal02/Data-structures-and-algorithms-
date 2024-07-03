import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        double disprice,originalprice,dispercent;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter original price: ");
        originalprice = input.nextDouble();
        System.out.println("Enter discounted percentage: ");
        dispercent = input.nextDouble();

        disprice = originalprice - (dispercent/100 * originalprice);

        System.out.println("after discount price is: "+ disprice);

    }
}
