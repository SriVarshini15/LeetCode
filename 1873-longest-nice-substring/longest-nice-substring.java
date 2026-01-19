class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2){
            return "";
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))){
                continue;
            }else{
                String sub1=longestNiceSubstring(s.substring(0,i));
                String sub2=longestNiceSubstring(s.substring(i+1));
                if(sub1.length()>=sub2.length()){
                    return sub1;
                }else{
                    return sub2;
                }
            }
        }
        return s;
    }
}