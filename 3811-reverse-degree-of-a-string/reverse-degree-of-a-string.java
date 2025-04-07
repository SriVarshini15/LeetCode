class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int val=(int)(s.charAt(i)-'a')+1;
            res+=(i+1)*(27-val);
        }
        return res;
    }
}