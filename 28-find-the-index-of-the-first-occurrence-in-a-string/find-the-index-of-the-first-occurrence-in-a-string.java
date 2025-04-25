class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        int len=haystack.length()-needle.length()+1;
        outter:for(int i=0;i<len;i++){
            inner:for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    index=i;
                    if(j==needle.length()-1){
                        break outter;
                    }
                }else{
                    index=-1;
                    break inner;
                }
            }
        }
        return index;
    }
}
