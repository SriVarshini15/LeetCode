/*class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> stot=new HashMap<>();
        HashMap<Character,Character> ttos=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);

            if(stot.containsKey(schar)){
                if(stot.get(schar)!=tchar){
                    return false;
                }
            }else{
                stot.put(schar,tchar);
            }
            if(ttos.containsKey(tchar)){
                if(ttos.get(tchar)!=schar){
                    return false;
                }else{
                    ttos.put(tchar,schar);
                }
            }
        }
        return true;
    }
}*/
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // First check for null or unequal lengths
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> stot = new HashMap<>();
        HashMap<Character, Character> ttos = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            // Check s → t mapping
            if (stot.containsKey(schar)) {
                if (stot.get(schar) != tchar) {
                    return false;
                }
            } else {
                stot.put(schar, tchar);
            }
            
            // Check t → s mapping
            if (ttos.containsKey(tchar)) {
                if (ttos.get(tchar) != schar) {
                    return false;
                }
            } else {
                ttos.put(tchar, schar);
            }
        }
        return true;
    }
}