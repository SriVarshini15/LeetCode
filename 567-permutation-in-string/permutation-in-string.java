class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start=0,end=0;
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(!need.containsKey(s1.charAt(i))){
                need.put(s1.charAt(i),0);
            }
            need.put(s1.charAt(i),need.get(s1.charAt(i))+1);
        }
        while(end<s2.length()){
            if(!need.containsKey(s2.charAt(end))){
                end++;
                start=end;
                have.clear();
                continue;
            }
            if(!have.containsKey(s2.charAt(end))){
                have.put(s2.charAt(end),0);
            }
            have.put(s2.charAt(end),have.get(s2.charAt(end))+1);
            while(have.get(s2.charAt(end))>need.get(s2.charAt(end))){
                
                have.put(s2.charAt(start),have.get(s2.charAt(start))-1);
                start++;
            }
            if(end-start+1==s1.length()){
                return true;
            }
            end++;
        }
        return false;
    }
}