class Solution {
    public boolean detectCapitalUse(String word) {
        int countSmall=0,countCaps=0;

       for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                countCaps++;
            }else{
                countSmall++;
            }
       } 
       if(countSmall==word.length() || countCaps==word.length()){
        return true;
       }else if(countSmall==word.length()-1 && (word.charAt(0)>='A' && word.charAt(0)<='Z')){
        return true;
       }
       return false;
    }
}