/*
class Solution {
    public void rotate(int[] nums, int k) {
        int res[]=new int[nums.length];
        if(nums.length<k){
            k = k % nums.length;
        }
        for(int i=0;i<k;i++){
            res[i]=nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k;i<nums.length;i++){
            res[i]=nums[j];
            j++;
        }
        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}*/
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1); // Reverse entire array
        reverse(nums, 0, k - 1);          // Reverse first k elements
        reverse(nums, k, nums.length - 1); // Reverse remaining elements
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}