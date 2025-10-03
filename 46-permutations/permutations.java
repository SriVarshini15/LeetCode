class Solution {
    public static void backtracking(int nums[],int start, List<List<Integer>> result){
        if(start==nums.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            result.add(temp);
            return ;
        }

        for(int i=start;i<nums.length;i++){
            swap(nums,start,i);
            backtracking(nums,start+1,result);
            swap(nums,start,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtracking(nums,0,result);
        return result;
    }
    public static void swap(int nums[],int start,int i ){
        int temp=nums[start];
        nums[start]=nums[i];
        nums[i]=temp;
    }
}