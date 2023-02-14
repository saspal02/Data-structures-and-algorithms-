// 8.To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scan.nextLine();
        boolean isPalindrome = true;

// Check if the string is a palindrome
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

// Print the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}




