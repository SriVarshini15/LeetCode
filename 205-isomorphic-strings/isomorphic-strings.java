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
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);

            if(map1.containsKey(schar)){
                if(map1.get(schar)!=tchar){
                    return false;
                }
            }
            else{
                    map1.put(schar,tchar);
                }
            if(map2.containsKey(tchar)){
                if(map2.get(tchar)!=schar){
                    return false;
                }
            }else{
                    map2.put(tchar,schar);
                }
        }
        return true;
    }
}