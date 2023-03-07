import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = input.nextDouble();
        System.out.print("Enter the commission rate: ");
        double rate = input.nextDouble();
        double commission = (sales * rate) / 100;
        System.out.println("Commission amount is: " + commission);
    }
}
