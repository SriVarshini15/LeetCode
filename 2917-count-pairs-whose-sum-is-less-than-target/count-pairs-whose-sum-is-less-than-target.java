class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        Collections.sort(nums);
        int left=0;
        int right=nums.size()-1;

        while(left<=right){
            if(nums.get(left)+nums.get(right)<target){
                count=count+(right-left);
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
