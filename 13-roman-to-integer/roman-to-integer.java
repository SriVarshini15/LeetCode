import java.util.*;
class Solution {
    public int romanToInt(String s) {
        /* 
        I=1 
        V=5 
        X=10
        L=50
        C=100
        D=500
        M=1000 
        */
        int res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i=0;
        while(i<s.length()){
            int current=map.get(s.charAt(i));
            if(i+1<s.length()){
                int next=map.get(s.charAt(i+1));
                if(current>=next){
                    res+=current;
                    i++;
                }else{
                    res=res+next-current;
                    i+=2;
                }
            }else{
                res+=current;
                i++;
            }
        }
        return res;
    }
}