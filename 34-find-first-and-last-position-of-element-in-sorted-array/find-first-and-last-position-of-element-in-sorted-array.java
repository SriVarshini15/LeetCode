class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ind = new int[2];
        int res = search(nums, target);

        if (res == -1) {
            ind[0] = -1;
            ind[1] = -1;
            return ind;
        }

        int left = res;
        while (left - 1 >= 0 && nums[left - 1] == target) {
            left--;
        }

        int right = res;
        while (right + 1 < nums.length && nums[right + 1] == target) {
            right++;
        }

        ind[0] = left;
        ind[1] = right;
        return ind;
    }

    public static int search(int nums[], int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
