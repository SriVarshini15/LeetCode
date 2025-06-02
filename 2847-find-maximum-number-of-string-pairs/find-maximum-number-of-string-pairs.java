class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            StringBuilder rev=new StringBuilder();
            rev.append(word.charAt(1));
            rev.append(word.charAt(0));
            String revstr=rev.toString();
            if(map.containsKey(revstr)){
                count++;
            }else{
                map.put(word,1);
            }
        }
        return count;
    }
}
/*
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
*/