package Easy;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {2,4,8};
        System.out.println(largest(arr,arr.length - 1));

    }

    public static int largest(int[] numbers,int index) {
        if (index == 0) {
            return numbers[0];
        }

        return Math.max(numbers[index],largest(numbers,index - 1));
    }
}
