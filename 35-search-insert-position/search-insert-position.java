class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums,target);

    }
    public static int search(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
            
        }
        return left;
    }
}