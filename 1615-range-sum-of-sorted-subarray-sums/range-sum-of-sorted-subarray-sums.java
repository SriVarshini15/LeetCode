class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int newArr[]=new int[n*(n+1)/2];
        int idx=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                newArr[idx++] = sum; 
            }
        }
        Arrays.sort(newArr);
        int result=0;
        int mod = 1_000_000_007;
        for(int i=left-1;i<=right-1;i++){
            result= (result+newArr[i])%mod;
        }
        return result;
    }
}
