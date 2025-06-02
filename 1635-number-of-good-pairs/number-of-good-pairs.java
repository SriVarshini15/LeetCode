class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (freq.containsKey(num)) {
                count += freq.get(num); 
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return count;

        /*int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
        */
    }
}