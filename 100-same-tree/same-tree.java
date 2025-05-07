/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();

        TreeNode cur1=p;
        TreeNode cur2=q;
        if(p==null && q==null){
            return true;
        }
        while((cur1!=null || !stack1.isEmpty()) && (cur2!=null || !stack2.isEmpty())){
            while(cur1!=null && cur2!=null ){
                stack1.push(cur1);
                cur1=cur1.left;

                stack2.push(cur2);
                cur2=cur2.left;
            }
            
            if(cur1!=null || cur2!=null){
                return false;
            }

            cur1=stack1.pop();
            cur2=stack2.pop();
            if(cur1.val!=cur2.val){
                return false;
            }
            cur1=cur1.right;
            cur2=cur2.right;
        }
        
        return cur1==null && cur2==null && stack1.isEmpty() && stack2.isEmpty();
    }
}