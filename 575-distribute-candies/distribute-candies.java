class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:candyType){
            set.add(ele);
        }
        int half=candyType.length /2;
        if(half>set.size()){
            return set.size();
        }
        return half;

    }
}