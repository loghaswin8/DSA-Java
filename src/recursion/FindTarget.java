package recursion;

import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {1,3,5,5,7,5,11};
//        System.out.println(find(arr, 5, 0));
//        System.out.println(findIndex(arr, 5, 0));
//        System.out.println(findIndexLast(arr, 5, arr.length - 1));
//        ArrayList<Integer> ans = findIndexList(arr, 5, 0, new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findAllIndex(arr, 5, 0));
    }
    static boolean find (int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || find(arr, target, i + 1);
    }
    static int findIndex(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return findIndex(arr, target, i + 1);
        }
    }
    static int findIndexLast (int[] arr, int target, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return findIndexLast(arr, target, i - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findIndexList1(int[] arr, int target, int i) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return findIndexList1(arr, target, i + 1);

    }
    static ArrayList<Integer> findIndexList(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
            return findIndexList(arr, target, i + 1, list);

    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> indexFromBelowCalls = findAllIndex(arr, target, i + 1);
        list.addAll(indexFromBelowCalls);
        return list;
    }
}
