class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if(x==0):
            return 0
        left=1
        right=x
        res=0
        while(left<=right):
            mid=left+(right-left)/2
            if(mid<=x/mid):
                left=mid+1
                res=mid
            else:
                right=mid-1
        return res
        