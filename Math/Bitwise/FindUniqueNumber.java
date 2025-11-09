package Bitwise;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; // Example array with duplicates and one unique number
        int uniqueNumber = findUnique(nums);
        System.out.println("The unique number is: " + uniqueNumber); // String.Output: 4
    }

    // Method to find the unique number using XOR
    public static int findUnique(int[] nums) {
        int unique = 0; // Initialize the unique number
        for (int num : nums) {
            unique ^= num; // Apply XOR operation
        }
        return unique; // Return the unique number
    }
}
