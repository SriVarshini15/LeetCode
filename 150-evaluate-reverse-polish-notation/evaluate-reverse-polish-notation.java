public class Solution {
    Node head=null;
    public String pop() {
        if (head == null) return null;
        String data = head.data;
        head = head.next;
        return data;
    }
    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public int evalRPN(String[] tokens) {
        Solution stack=new Solution();
       int n=tokens.length;
       int result=0;
       for(int i=0;i<n;i++){
            if(tokens[i].equals("+") ||tokens[i].equals("-") ||tokens[i].equals("*") ||tokens[i].equals("/") ){
                int n2=Integer.parseInt(stack.pop());
                int n1=Integer.parseInt(stack.pop());
                switch (tokens[i]) {
                    case "+": 
                        result = n1+n2; 
                        break;
                    case "-": 
                        result = n1-n2;
                        break;
                    case "*": 
                        result = n1*n2;
                        break;
                    case "/": 
                        result = n1/n2;
                        break;
                }
                stack.push(String.valueOf(result));
            }else{
                stack.push(tokens[i]);
            }
       } 
        return Integer.parseInt(stack.pop());
    }
}

class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }
}

