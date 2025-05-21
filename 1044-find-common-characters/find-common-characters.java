class Solution {
    public List<String> commonChars(String[] words) {
        int minFreq[]=new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);
        for(int i=0;i<words.length;i++){
            int freq[]=new int[26];
            String current=words[i];
            for(char ele:current.toCharArray() ){
                freq[ele-'a']++;
            }
            for(int j=0;j<26;j++){
                minFreq[j]=Math.min(minFreq[j],freq[j]);
            }
        }

        List<String> list=new ArrayList<>();
        for(int j=0;j<26;j++){
             for(int i=0;i<minFreq[j];i++){
                list.add(String.valueOf((char)(j + 'a')));
             }   
        }
        return list;
    }
}
