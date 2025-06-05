public class Solution {
    Node head=null;
    public void push(char data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public Character pop(){
        if(head==null){
            return null;
        }
        char ch=head.data;
        head=head.next;
        return ch;
    }
    public boolean isValid(String s) {
        Solution stack=new Solution();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
                Character top = stack.pop();
                if(top == null ||!stack.check(s.charAt(i),top)){
                    return false;
                }
            }
            
        }
        if(stack.head!=null){
            return false;
        }
        return true;
    }

    public boolean check(char ch,Character cur){
        if(ch==')' && cur=='(') return true;
        if(ch=='}' && cur=='{') return true;
        if(ch==']' && cur=='[') return true;
        return false;
    }
}
class Node{
    char data;
    Node next;
    Node(char data){
        this.data=data;
        this.next=null;
    }
}


/* 
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
 */