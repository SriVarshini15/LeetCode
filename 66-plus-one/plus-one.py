class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        for i in range(len(digits),0,-1):
            if(digits[i-1]<9):
                digits[i-1]=digits[i-1]+1
                return digits
            
            digits[i-1]=0
        newlist=[0]*(len(digits)+1)
        newlist[0]=1
        return newlist
        