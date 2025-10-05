class Solution {
    public int longestPalindrome(String s) {
        String str=s.toLowerCase();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean odd=false;
        int count=0;
        for(int value:map.values()){
            if(value%2==1){
                odd=true;
                count+=(value-1);
            }else{
                count+=value;
            }
        }
        if(odd){
            count+=1;
        }
        return count;
    }
}
