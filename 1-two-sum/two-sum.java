class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int temp=target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}
int res[]=new int[2];
        x:for(int i=0;i<nums.length-1;i++){
            int val=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(val==nums[j]){
                    res[0]=i;
                    res[1]=j;
                    break x;
                }
            }
        }
        return res;
*/