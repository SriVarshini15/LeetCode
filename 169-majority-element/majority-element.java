class Solution {
    public int majorityElement(int[] nums) {
        int n=0, max=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Integer value:map.keySet()){
            if(map.get(max)<map.get(value))
               max= value;
        }
        return max;
    }

}