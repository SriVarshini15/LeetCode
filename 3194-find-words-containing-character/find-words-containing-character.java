class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list =new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String curr=words[i];
            for(int j=0;j<curr.length();j++){
                if(curr.charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}