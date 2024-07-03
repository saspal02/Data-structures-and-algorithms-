import java.util.Scanner;

public class Evendays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days in the month: ");
        int days = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("Kunal can go out on " + count + " days in the month of August.");
    }
}
