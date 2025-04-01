class Solution {
    public String toLowerCase(String s) {
        int len=s.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                res.append((char)(ch+32));
            }else{
                res.append(ch);
            }
        }

        return res.toString();
    }
}