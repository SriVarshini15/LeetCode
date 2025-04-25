class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        count=0
        for i in range(len(s),0,-1):
            if(s[i-1]==' ' and count==0):
                continue;
            if(s[i-1]==' '):
                break
            count+=1
        return count
        