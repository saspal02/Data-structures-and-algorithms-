package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,18,22,25,67};
        int target = 19;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }

    // return the index: greatest number <= target
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //If target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}

