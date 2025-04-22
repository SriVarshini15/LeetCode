class Solution {
    public boolean isValid(String s) {
        Stack<Character> container=new Stack<>();
        boolean result=true;
        if(s.length()%2!=0){
            result=false;
        }else{
            loop:for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='[' || s.charAt(i)=='{' ||s.charAt(i)=='(' ){
                    container.push(s.charAt(i));
                }
                else{
                    if(container.isEmpty()){
                        result=false;
                        break loop;
                    }
                    if(!comparison(container.pop(),s.charAt(i))){
                        result=false;
                        break loop;
                    }
                }
            }
            if (!container.isEmpty()) {
                result = false;
            }
        }
        return result;
    }

        
    public static boolean comparison(char str1,char str2){
        if(str1=='(' && str2==')'){
            return true;
        }if(str1=='[' && str2==']'){
            return true;
        }if(str1=='{' && str2=='}'){
            return true;
        }
        return false;
    }
}