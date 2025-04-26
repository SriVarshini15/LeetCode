# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if(not head):
            return None

        left=head
        right=head.next
        while(right):
            if(left.val!=right.val):
                left.next=right
                left=left.next
            right=right.next

        left.next=None
        return head
            

        