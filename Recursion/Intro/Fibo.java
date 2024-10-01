package Intro;

public class Fibo {
    public static void main(String[] args) {
//        int ans = fibo(4); // This should correctly call fibo(4)
//        System.out.println(ans); // This should print 3
//    }
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n) {
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n) {
        // Base condition
        if (n < 2) {
            return n; // Returns n for fibo(0) and fibo(1)
        }


        // Recursive calls
        return fibo(n - 1) + fibo(n - 2); // Computes the Fibonacci number recursively
    }
}
