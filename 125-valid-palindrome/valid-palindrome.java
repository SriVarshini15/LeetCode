class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)<='9' && str.charAt(i)>='0')){
                sb.append(str.charAt(i));
            }
        }
        String newStr=sb.toString();
        //System.out.println(newStr);
        int len=newStr.length();
        for(int i=0;i<len/2;i++){
            if(newStr.charAt(i)!=newStr.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}