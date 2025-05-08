public class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++){
            int check=(int) Math.pow(2,i);
            if(n==check){
                return true;
            }
        }
        return false;
    }
}