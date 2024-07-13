package LinearSearch;

public class SearchInrange {
    public static void main(String[] args) {
        int[] arr = {10,56,89,40,14};
        int target = 56;
        System.out.println(linearSearch(arr,target,1,3));

    }

    static int linearSearch(int[] arr,int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        //run a loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }
}
