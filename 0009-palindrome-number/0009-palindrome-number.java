class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp=x, k=0;
        while(temp>0){
            k = (k*10) + temp%10;
            temp = temp/10;
        }
        if(k == x){
            return true;
        }
        return false;
    }
}