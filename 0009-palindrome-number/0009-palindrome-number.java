class Solution {
    public boolean isPalindrome(int x) {
        /* 
        Method 1:


        String val=String.valueOf(x);
        for(int i=0;i<val.length()/2;i++){
            if( val.charAt(i)!=(val.charAt(val.length()-i-1))){
                return false;
            }
        }
        return true; */

        //Method 2
        int temp=0,org=x;
        while(x>0){
            int rem=x%10;
            temp=temp*10+rem;
            x/=10;
        }
        if(temp==org){
            return true;
        }
        return false;
    }
}
