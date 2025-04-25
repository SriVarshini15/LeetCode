class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(cur=='(' ||cur=='[' ||cur=='{'){
                stack.push(cur);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(!matching(stack.pop(),cur)){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;

    }
    public static boolean matching(char c1,char c2){
        if(c1=='(' && c2==')') return true;
        if(c1=='[' && c2==']') return true;
        if(c1=='{' && c2=='}') return true;

        return false;
    }
}