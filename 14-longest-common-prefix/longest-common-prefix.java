class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        int l=strs[0].length();
        int ind=-1;
        outter:for(int i=0;i<l;i++){
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i >= strs[j].length() || ch!=strs[j].charAt(i)){
                    break outter;
                }
            }
            ind++;
        }

        String s="";
        for(int i=0;i<=ind;i++){
            s+=strs[0].charAt(i);
        }
        
        return s;
    }
}



/* import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int ind = strs[0].length();
        String previous = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String current = previous.length() < strs[i].length() ? previous : strs[i];
            int cur_ind = 0;
            for (int j = 0; j < current.length(); j++) {
                if (previous.charAt(j) == strs[i].charAt(j)) {
                    cur_ind++;
                } else {
                    break;
                }
            }
            ind = ind > cur_ind ? cur_ind : ind;
            if (ind == 0) {
                return "";
            }
        }
        String result = "";
        for (int i = 0; i < ind; i++) {
            result += strs[0].charAt(i);
        }
        return result;
    }
}
 */