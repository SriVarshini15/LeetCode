class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        String arr[]=split(s);
        if(arr.length!=pattern.length()){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }else{
                if (reverse.containsKey(word)) return false;
                map.put(ch,word);
                reverse.put(word, ch);
            }

        }
        return true;
        
    }
    public static String[] split(String s){
        ArrayList<String> result=new ArrayList<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                result.add(str);
                str="";
            }else{
                str+=s.charAt(i);
            }
        }
        result.add(str);
        return result.toArray(new String[0]);
    }
}