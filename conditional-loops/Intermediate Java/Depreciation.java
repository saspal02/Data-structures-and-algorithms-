import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the asset cost: ");
        double cost = input.nextDouble();
        System.out.print("Enter the salvage value: ");
        double salvage = input.nextDouble();
        System.out.print("Enter the useful life in years: ");
        double life = input.nextDouble();
        double depreciation = (cost - salvage) / life;
        System.out.println("Annual depreciation is: " + depreciation);
    }
}
