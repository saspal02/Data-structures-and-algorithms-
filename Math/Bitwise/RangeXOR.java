package Bitwise;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a - 1);

        System.out.println("Efficient XOR result: " + ans);

        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println("Naive XOR result: " + ans2);
    }

    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        } else {
            return 0;
        }
    }
}

