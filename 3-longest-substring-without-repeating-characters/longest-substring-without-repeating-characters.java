class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();
        int start=0;
        int end=0;
        while(end<s.length()){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }else{
                set.add(s.charAt(end));
                end++;
                maxLen=maxLen<set.size()?set.size():maxLen;
            }
        }
        return maxLen;
    }
}