class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        i=0
        res=0
        while(i<len(s)):
            current=dict[s[i]]
            if(i+1<len(s)):
                next=dict[s[i+1]]
                if(current>=next):
                    res+=current
                    i+=1
                else:
                    res+=next-current
                    i+=2
            else:
                res+=current
                i+=1

        return res
        