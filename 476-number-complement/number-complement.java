class Solution {
    public int findComplement(int num) {
        int temp=(Integer.highestOneBit(num)<<1)-1;
        return num^temp;
    }
}