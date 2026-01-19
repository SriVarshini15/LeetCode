class Solution {
    public int minimumRecolors(String blocks, int k) {
        int result=0;
        int min=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                result++;
            }

        }
        min=result;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                result++;
            }
            if(blocks.charAt(i-k)=='W'){
                result--;
            }
            min=min>result? result:min;
        }
        return min;
    }
}