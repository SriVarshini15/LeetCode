class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int f=2,s=3;
        int res=0;
        for(int i=4;i<=n;i++){
            res=f+s;
            f=s;
            s=res;
        }
        return res;
    }
}