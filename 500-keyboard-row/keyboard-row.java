class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> row1=new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> row2=new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        HashSet<Character> row3=new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
        ArrayList<String> str=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int r1=0,r2=0,r3=0;
            for(int j=0;j<words[i].length();j++){
                if(row1.contains(words[i].toLowerCase().charAt(j))){
                    r1++;
                }else if(row2.contains(words[i].toLowerCase().charAt(j))){
                    r2++;
                }else{
                    r3++;
                } 
            }
            if(r1==words[i].length() ||r2==words[i].length() ||r3==words[i].length()){
                str.add(words[i]);
            }
        }
        return str.toArray(new String[0]);
    }
}