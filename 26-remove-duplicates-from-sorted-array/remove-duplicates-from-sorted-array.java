class Solution {
    public int removeDuplicates(int[] nums) {
       int ind=0;
       for(int j=1;j<nums.length;j++){
            if(nums[ind]!=nums[j]){
                ind++;
                nums[ind]=nums[j];
            }
       }
       return ind+1;
    }
    
}