class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<word.length() && word.charAt(i)!=ch ){
            stack.push(word.charAt(i++));
        }
        if(i==word.length()){
            return word;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(word.charAt(i++));
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        for(int j=i;j<word.length();j++){
            sb.append(word.charAt(j));
        }
        return new String(sb);
    }
}
