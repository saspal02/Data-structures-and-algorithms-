public class Pattern14 {
    public static void main(String[] args) {
        int n = 5; // Define the number of rows you want to print

        for (int i = 1; i <= n; i++) { // Loop for each row
            char letter = 'A'; // Start the sequence from 'A'
            for (int j = 1; j <= i; j++) { // Loop for each column in the row
                System.out.print(letter + " "); // Print the current letter
                letter++; // Move to the next letter
            }
            System.out.println(); // Move to the next line after printing the current row
        }
    }
}
