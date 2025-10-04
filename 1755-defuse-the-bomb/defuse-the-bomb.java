class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int result[]=new int[n];
        if(k==0){
            return result;
        }else if(k<0){
            k=-(k);
            for(int i=0;i<n;i++){
                for(int j=i;j<i+k;j++){
                    result[i]+=code[(n-k+j)%n];
                }
            }
        }else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<=i+k;j++){
                    result[i]+=code[j%n];
                }
            }
        }
        
        
        return result;
    }
}