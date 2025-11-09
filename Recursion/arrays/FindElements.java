package arrays;

import java.util.ArrayList;

public class FindElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6};
        System.out.println(findIndex(arr,5,0));
        System.out.println(findElement(arr,4,0));
        System.out.println(findIndexLast(arr,4,arr.length - 1));
//        findAllIndex(arr,4,0);
//        System.out.println(list);
        System.out.println(findAllIndex2(arr,4,0));


        ArrayList<Integer> ans = findAllIndex(arr,4,0, new ArrayList<>());
        System.out.println(ans);

    }

    static boolean findElement(int[] arr,int target,int index) {
        if (index == arr.length) {
            return false;
        }

        return arr [index] == target || findElement(arr,target,index + 1);
    }

    static int findIndex(int[] arr,int target,int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr,target,index + 1);
        }
    }

    static int findIndexLast(int[] arr,int target,int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr,target,index - 1);
        }
    }

    static ArrayList findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr,target,index + 1,list);
    }

    static ArrayList findAllIndex2(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        //this will contain answer for that function only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
