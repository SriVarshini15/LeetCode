class Solution {
    public boolean canAliceWin(int[] nums) {
        int sSum = 0, dSum = 0;
        
        for (int num : nums) {
            if (num <= 9) {
                sSum += num;
            } else {
                dSum += num;
            }
        }
        
        return (sSum > dSum || dSum > sSum);
    }
}
