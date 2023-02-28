public class ProductAndSum {
        public static void main(String[] args) {
            int n = 234;
            int sum = 0;
            int product = 1;

            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                product *= digit;
                n /= 10;
            }

            int result = product - sum;
            System.out.println("Result: " + result);
        }
    }


