class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if(n<=3):
            return n
        f=2
        s=3
        fib=0
        for i in range(4,n+1):
            fib=f+s
            f=s
            s=fib
        
        return fib
        