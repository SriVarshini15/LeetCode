class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}
/* 
public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            int k=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[k]>nums[j]){
                    k=j;
                }
            }
            int temp=nums[k];
            nums[k]=nums[i];
            nums[i]=temp;
        }
        return nums;
    } */