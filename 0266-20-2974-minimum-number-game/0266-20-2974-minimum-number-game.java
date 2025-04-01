class Solution {
    public int[] numberGame(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len];

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        for (int i = 0; i < len - 1; i += 2) {
            arr[i] = nums[i + 1];
            arr[i + 1] = nums[i];
        }

        return arr;
    }
}
