
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vmap=new HashMap<>();
        HashMap<Character,Integer> cmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vmap.put(s.charAt(i),vmap.getOrDefault(s.charAt(i),0)+1);
            }else{
                cmap.put(s.charAt(i),cmap.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int vmax=0,cmax=0;
        for(int v:vmap.values()){
            if (v > vmax) vmax = v;
        }
        for(int v: cmap.values()){
            if (v > cmax) cmax = v;
        }
        return cmax+vmax;
    }
    public static boolean isVowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
}