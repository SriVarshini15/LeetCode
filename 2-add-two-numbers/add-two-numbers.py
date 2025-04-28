# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        result= ListNode(0);
        carry=0
        current=result

        while(l1 is not None or l2 is not None):
            val1=0
            val2=0
            if(l1 is not None):
                val1=l1.val
            else:
                val1=0
            if(l2 is not None):
                val2=l2.val
            else:
                val2=0
            sum=val1+val2+carry

            carry=sum//10
            temp=sum%10
            current.next=ListNode(temp)
            current=current.next

            if(l1!=None):
                l1=l1.next
            if(l2!=None):
                l2=l2.next

        if(carry>0):
            current.next=ListNode(carry)
        return result.next
        