package recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,12,23,45,67,89};
        int target = 89;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }

    static int binarySearch(int[] arr, int s, int e, int target) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[m] > target) {
            return binarySearch(arr, s, m - 1, target);
        }

        return binarySearch(arr, m + 1, e, target);
    }
}