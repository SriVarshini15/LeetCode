class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            String current="";
            current+=words[i].charAt(1);
            current+=words[i].charAt(0);
            for(int j=i+1;j<words.length;j++){
                if(current.equals(words[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}