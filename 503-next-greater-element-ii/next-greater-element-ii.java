class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[]=new int[nums.length];
        int n=nums.length;
        Arrays.fill(res,-1);
        int max=nums[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+i;j++){
                int next=nums[j%n];
                if(nums[i]<next){
                    res[i]=next;
                    break;
                }

            }
            
        }
        return res;
    }
}

