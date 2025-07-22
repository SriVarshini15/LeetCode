class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list= new ArrayList<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(word)){
                    if(!set.contains(word)){
                        set.add(word);
                        list.add(word);
                    }
                }
            }
        }
        return list;
    }
}