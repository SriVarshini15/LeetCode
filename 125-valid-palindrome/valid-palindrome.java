class Solution {
    public boolean isPalindrome(String s) {
        int j=s.length()-1;
        int i=0;
        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if (c1>='A' && c1<='Z'){
                c1=(char) (c1-'A'+'a');
            }
            if (c2>='A' && c2<='Z'){
                c2=(char) (c2-'A'+'a');
            }
            if (checkAlpha(c1)){
                if(checkAlpha(c2)){
                    if (c1==c2){
                        i++;
                        j--;
                        continue;
                    }
                    /*if(i+1==j){
                        if(s.length()==2){
                            if(c1!=c2){
                                return false;
                            }
                        }
                        return true;
                    
                    }*/
                    return false;
                }else{
                    j--;
                }
            }else{
                i++;
            }

        }
        return true;
    }
    public static boolean checkAlpha(char c){
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c>='0' && c<='9')){
            return true;
        }
        return false;
    }
}