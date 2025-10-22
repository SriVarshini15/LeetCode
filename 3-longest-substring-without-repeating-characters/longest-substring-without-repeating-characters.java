class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            int count=0;
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                count++;
            }
            if (count > max) {
                max = count;  
            }
        }
        return max;
    }
}

/* class Solution {
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
} */