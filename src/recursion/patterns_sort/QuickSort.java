package recursion.patterns_sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
//        Qsort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Qsort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s<=e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        //now my pivot is at correct index, sort two halves now
        Qsort(nums, low, e);
        Qsort(nums, s, hi);
    }
}
