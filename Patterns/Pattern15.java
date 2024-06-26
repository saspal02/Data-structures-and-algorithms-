public class Pattern15 {
    public static void main(String[] args) {
        int n = 5; // Define the number of rows (adjust as needed)
        int spaces = 2 * n - 2; // Initial number of spaces

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }

            // Print stars on the left side
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars on the right side
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            // Adjust spaces for the next row
            if (i < n) {
                spaces -= 2; // Decrease spaces for upper half
            } else {
                spaces += 2; // Increase spaces for lower half
            }
        }
    }
}
