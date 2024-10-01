package Bitwise;

public class resetTheBit {
    public static void main(String[] args) {
        int number = 6;
        int i = 2;

        int newNumber = resetTheBit(number, i);

        System.out.println("After resetting the " + i + "th bit, the number is: " + newNumber);
    }

    public static int resetTheBit(int number,int i) {
        return number & ~(1 << (i - 1));
    }
}
