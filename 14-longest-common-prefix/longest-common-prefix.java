import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        int l = strs[0].length();
        int end = l;
        
        for (int i = 1; i < strs.length; i++) {
            int temp = Math.min(strs[i].length(), l);
            int j = 0;
            while (j < temp && strs[0].charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            end = Math.min(j, end);
            if (end == 0) break;
        }
        
        for (int i = 0; i < end; i++) {
            sb.append(strs[0].charAt(i));
        }
        
        return sb.toString();
    }
}