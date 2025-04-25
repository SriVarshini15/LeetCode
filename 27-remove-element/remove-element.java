class Solution {
    public int removeElement(int[] nums, int val) {
        int ind=0;
        if(nums.length==0){
            return ind;
        } 
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[ind]=nums[j];
                ind++;
            }
        }
        return ind;
    }
}