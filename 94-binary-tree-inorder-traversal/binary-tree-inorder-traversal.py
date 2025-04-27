# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        stack=[]
        result=[]
        if(root==None):
            return result
        current =root
        while(current!=None or stack):
            while(current!=None):
                stack.append(current)
                current=current.left
            current=stack.pop()
            result.append(current.val)
            current=current.right
        return result

        