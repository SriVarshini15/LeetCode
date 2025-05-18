/* class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
} */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}