package Bitwise;

public class PositionOfRightmostSetBit {
    public static int rightmostSetBitPosition(int number) {
        // Isolate the rightmost set bit
        int rightmostSetBit = number & -number;

        // Count the position (1-based index)
        int position = 1; // Starting position is 1
        while (rightmostSetBit > 1) {
            rightmostSetBit >>= 1; // Right shift
            position++; // Increment position
        }

        return position;
    }

    public static void main(String[] args) {
        int number = 18;  // Example number
        int position = rightmostSetBitPosition(number);
        System.out.println("The position of the rightmost set bit in " + number + " is: " + position);
    }
}
