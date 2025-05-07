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
    public boolean isSymmetric(TreeNode root) {

        if(root==null){
            return true;
        }

        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();

        TreeNode cur1=root.left;
        TreeNode cur2=root.right;
        while((cur1!=null || !stack1.isEmpty()) && (cur2!=null || !stack2.isEmpty())){
            while(cur1!=null && cur2!=null){
                stack1.push(cur1);
                stack2.push(cur2);

                cur1=cur1.left;
                cur2=cur2.right;
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
            cur2=cur2.left;
        }
        return cur1==null && cur2==null && stack1.isEmpty() && stack2.isEmpty();
    }
}