package Collections.Streams;

import java.util.Arrays;
import java.util.List;

public class SumofSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sumOfSquares = numbers.stream()
                .map(n -> n * n)
                .reduce(0,Integer::sum);
        System.out.println(sumOfSquares);
    }
}
