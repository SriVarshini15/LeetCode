
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if(used.contains(nums[i])) continue;
            used.add(nums[i]);
            swap(nums, start, i); 
            backtrack(nums, start + 1, result); 
            swap(nums, start, i); 
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}