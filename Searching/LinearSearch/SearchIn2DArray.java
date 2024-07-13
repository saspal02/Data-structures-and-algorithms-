package LinearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 90, 67, 4},
                {18, 12}
        };
        System.out.println(search(arr));
    }

    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) { //To find min value try int min = Integer.MAX_VALUE
                    max = arr[i][j];   //This time use arr[i][j] < min
                }
            }
        }
        return max; // Target not found
    }
}
