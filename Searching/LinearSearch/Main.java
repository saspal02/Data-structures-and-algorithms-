package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,4,5,9,10,44,90};
        int target = 100;
        int ans = linearSearch(nums,target);
        int ans2 = linearSearch2(nums,target);
        boolean ans3 = linearSearch3(nums,target);

        System.out.println("index: "+ ans);

        System.out.println("Element: "+ans2);

        System.out.println("Boolean: "+ans3);

    }

    //Search the array return the index if item found
    //Otherwise if item not found return -1

    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }


    //Search the target and return true or false
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }

        return -1;
    }

    //Search the target and return true or false
    static boolean linearSearch3(int[] arr,int target) {
        if (arr.length == 0) {
            return false;
        }
        //run a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }

        }
        return false;
    }





}
