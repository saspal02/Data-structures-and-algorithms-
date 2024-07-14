package BinarySearch;

public class OrderAgnosticBinarySearch {

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] ascendingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] descendingArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int target = 5;

        int result1 = orderAgnosticBinarySearch(ascendingArray, target);
        System.out.println("Index of " + target + " in ascending array: " + result1);

        int result2 = orderAgnosticBinarySearch(descendingArray, target);
        System.out.println("Index of " + target + " in descending array: " + result2);
    }
}
