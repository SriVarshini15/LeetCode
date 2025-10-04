class Solution {
    public int[] sumZero(int n) {
        int nums[]=new int[n];
        if(n%2==0){
            for(int i=0;i<n;i+=2){
                nums[i]=i+1;
                nums[i+1]=-(i+1);
            }
        }else{
            nums[n-1]=0;
            for(int i=1;i<n;i+=2){
                nums[i]=i;
                nums[i+1]=-(i);
            }
        }
        return nums;
    }
}