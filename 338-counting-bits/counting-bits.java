class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=Integer.bitCount(i);
        }
        return arr;
    }
}
/*
    private int countOnes(int num) {
    int count = 0;
    while (num != 0) {
        if ((num & 1) == 1) {
            count++;
        }
            num >>= 1;
        }
        return count;
    }

 */