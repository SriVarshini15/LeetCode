class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int max=0;
        int val=-1;
        for(int ele:map.keySet()){
            if(max<map.get(ele)){
                max=map.get(ele);
                val=ele;
            }
        }
        return val;
    }
}