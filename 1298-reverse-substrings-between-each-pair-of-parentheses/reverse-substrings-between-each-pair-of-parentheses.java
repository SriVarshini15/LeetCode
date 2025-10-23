class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
                stack.push(s.charAt(i));
            }else{
                String str="";
                while(!stack.isEmpty() && stack.peek()!='('){
                    str+=stack.pop();

                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
                for(int j=0;j<str.length();j++){
                    stack.push(str.charAt(j));
                }
            }
        }
        String result="";
        while(!stack.isEmpty()){
            result=stack.pop()+result;
        }
        return result;
    }
}