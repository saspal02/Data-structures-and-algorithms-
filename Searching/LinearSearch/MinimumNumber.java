package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {15,25,32,5,47,21};
        System.out.println(min(arr));

    }
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans ) { // arr[i] > ans to find maximum number
                ans = arr[i];
            }
        }
        return ans;
    }
}
