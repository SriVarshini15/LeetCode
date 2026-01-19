class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int count=0;
        double avg=(double) windowSum/k;
        count= avg>=threshold? count+1:count;
        for(int i=k;i<arr.length;i++){
            windowSum+=arr[i];
            windowSum-=arr[i-k];
            double cur= (double) windowSum/k;
            count= cur>=threshold? count+1:count;
        }
        return count;
    }
}