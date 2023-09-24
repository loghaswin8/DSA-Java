class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i< nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        //search missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1};
            }
        }

        //case 2
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}