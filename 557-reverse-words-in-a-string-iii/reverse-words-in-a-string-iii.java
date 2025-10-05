class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String str="";
        boolean yes=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                str+=s.charAt(i);
            }else{
                sb.append(reverse(str));
                sb.append(" ");
                str="";
            }
        }
        sb.append(reverse(str));
        return sb.toString();
    }
    private String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
}